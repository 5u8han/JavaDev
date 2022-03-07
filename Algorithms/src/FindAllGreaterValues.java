import java.util.Arrays;
import java.util.Scanner;

public class FindAllGreaterValues {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] A = new int[n];
        for( int i=0; i<n; i++ ) {
            A[i] = inp.nextInt();
        }
        Arrays.sort(A);
        while( inp.hasNextInt()) {
            int val = inp.nextInt();
            int left = 0, right = A.length-1;

            while( left <= right ) {
                int mid = left + (right-left)/2;
                if( A[mid] == val ) {
                    left = mid+1;
                    break;
                }
                else if( A[mid] < val ) {
                    left = mid+1;
                }
                else {
                    right = mid-1;
                }
            }
            System.out.println(n-left);
        }
    }
}
