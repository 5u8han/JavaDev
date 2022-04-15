import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortingAlgorithms {
    public static void main(String[] args) {
       int [] A = {3, 1, 8, -2, 4, 5};
        //  int [] B = selectionSort(A);
        int [] B = {9, 3, 8, 2, 1, 10};
        System.out.println(bubbleSort(B.length,B));
        System.out.println("This is bubble sort: ");

        for(int i=0; i<B.length; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println(selectionSort(A.length,A));
        System.out.println("This is selection sort: ");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        String text = "abracadabra";
        String pattern = "dab";

foo("Niggers",7);
     //   stringMatching(text,pattern );
         char [] texty =
                {'m', 'o', 'k', 'y', 'o', 'n', 'e', 'm', 'n', 'e', 'y', 'y'};

         char [] patterny =
                {'m', 'o', 'n', 'e', 'y'};

        kRelaxedSubstring(texty,patterny,texty.length);

    }


    public static  int [] selectionSort(int n,int [] A){
        int comparisons =0;
        for (int i=0; i< A.length-1; i++){
            int minIndex= i;
            for (int j =i+1; j< A.length; j++ ){
                if (A[j] < A[minIndex]){
                    minIndex =j;
                    comparisons++;
                    int temp = A[minIndex];
                    A[minIndex]=A[i];
                    A[i] = temp;
                }
            }
            comparisons++;
        }
        System.out.println(comparisons);
        return A;
    }
        public static int [] bubbleSort(int n, int[] A){
        int comparisons =0;
            for (int i = 0; i < n-1; i++){
                for (int j =0; j< n-i-1;j++){
                    if(A[j]>A[j]+1) {
                        int temp = A[j];
                        A[j]= A[j+1];
                        A[j+1]=temp;
                        comparisons++;
                    }
                }
                comparisons++;
            }
            System.out.println("comparisons: "+comparisons);
            return A;
        }
        public static int [] seqSearch(int [] A){
        
        return A;
    }
    public static void stringMatching(String txt, String pat){
        int M = pat.length();
        int N = txt.length();

        /* A loop to slide pat one by one */
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++)
                if (txt.charAt(i + j) != pat.charAt(j)) break;
            if (j == M)
                System.out.println("Pattern found at index " + i);
        }

    }
    public static void kRelaxedSubstring(char [] text,
                                         char [] pattern,
                                         int k) {

        for (int i = 0; i < text.length - pattern.length; i++) {
            int count =0;
            for (int j = 1; j < pattern.length; j++){
                if(text[i] != pattern[j]){
                    count++;


                }

            }
        }
    }

  /* public static void printClosest(int pts[][], int ar2[], int m, int n)
    {
        ArrayList<Point> x = new ArrayList<>();
        ArrayList<Point> y = new ArrayList<>();
        for (int i=0;i< pts.length;i++){
            Point p = new Point(pts[i][0],pts[i][1]);
            x.add(p);
            y.add(p);
        }
        Collections.sort(x, (a, b)->a.x -b.x);
        Collections.sort(y, (a,b)->a.y -b.y);
        // Initialize the diff between pair sum and x.
        int diff = Integer.MAX_VALUE;

        // res_l and res_r are result indexes from ar1[] and ar2[]
        // respectively
        int res_l = 0, res_r = 0;

        // Start from left side of ar1[] and right side of ar2[]
        int l = 0, r = n - 1;
        while (l < m && r >= 0) {
            // If this pair is closer to x than the previously
            // found closest, then update res_l, res_r and diff
            if (Math.abs(ar1[l] + ar2[r] - x) < diff) {
                res_l = l;
                res_r = r;
                diff = Math.abs(ar1[l] + ar2[r] - x);
            }

            // If sum of this pair is more than x, move to smaller
            // side
            if (ar1[l] + ar2[r] > x)
                r--;
            else // move to the greater side
                l++;
        }

        // Print the result
        System.out.print("The closest pair is [" + ar1[res_l] + ", " + ar2[res_r] + "]");
    }
    public static void veryClose(int a, int b){
        double d = Double.POSITIVE_INFINITY;

    }*/

    public static String foo(String s, int n){
        
        if(n == 1) {
            return s[0];
        }
        return s[n-1] + foo(s, n-1);
    }


}
