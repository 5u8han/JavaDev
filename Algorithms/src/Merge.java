import java.util.*;

public class Merge {

    public static void main(String[] args) {
        System.out.println("welcome\n This program sorts an array of integers using merge sort");
        int a, b, c, d, temp, counter;
        Scanner input = new Scanner(System.in);

        System.out.println("enter the size of the left array or number of integers: ");
        int n = input.nextInt();

        int[] leftArray = new int[n];

        System.out.println("Now enter each number one by one and hit enter: ");
        for (int i = 0; i < n; i++) {
            leftArray[i] = input.nextInt();
            System.out.println("Next: ");
        }

        System.out.println("enter the size of the right array or number of integers: ");

        n = input.nextInt();

        int[] rightArray = new int[n];

        System.out.println("Now enter each number one by one and hit enter: ");
        for (int i = 0; i < n; i++) {
            rightArray[i] = input.nextInt();
            System.out.println("Next: ");

        }
        System.out.println("Now calling the merge method on both arrays passing in: ");
        int[] newArray = merge(leftArray, rightArray);

        System.out.println("Now printing the elements after sorting and merging both arrays: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }

    private static int[] merge(int[] arrayA, int[] arrayB) {
        int[] mergedArray = new int[arrayA.length + arrayB.length];

        int i = 0, j = 0, k = 0;

        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] < arrayB[j]) {
                mergedArray[k] = arrayA[i];
                i++;
                k++;
            } else {
                mergedArray[k] = arrayB[j];
                j++;
                k++;
            }
        }

        while (i < arrayA.length) {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        }

        while (j < arrayB.length) {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}

/*


    public static int [] merge(int [] a, int [] b)
    {
        int i=0, j =0,k =0, size=0;

        if(a.length > b.length){
            size = a.length;
        }
        else size = b.length;


          int[] newArray = new int [a.length +b.length];
        while(k < a.length && j<b.length ){

             if(a[k] < b[j] ){
                newArray[i] = a[k];
               k++;
            }
            else{
                newArray[i] =b[j];
                j++;
            }
            i++;

        }

        if(k == a.length){

            for( int somethingElse = i; somethingElse < newArray.length; somethingElse++  ){
                newArray[somethingElse] = b[j];
                j++;
            }

        }
        else if(k == b.length) {

                for( int somethingElse = i; somethingElse < newArray.length; somethingElse++  ){
                newArray[somethingElse] = a[k];
                k++;
                }
            }

        return newArray;
    }
     */

