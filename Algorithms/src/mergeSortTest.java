import java.util.Scanner;

public class mergeSortTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter array size: ");
        int [] arr = new int[input.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();


        }

       int[] sortedArr = mergeSort(arr, arr.length);
    }

    public static int[] mergeSort(int[] a, int n) {
        if (n < 2) {
            return a;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        //merge(a, l, r, mid, n - mid);
        return a;
    }

}
