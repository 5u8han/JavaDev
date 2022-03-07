import java.util.Scanner;
// work in progress
public class DynamicProgramming {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a value?: ");

        int n = 0, recCount=0;

        while (n != -1) {
            n = input.nextInt();
            long Fib = fib(n);

            System.out.println("the " + n + "th term of fibonacci is: " + Fib);
        }
    }

    static long fib(int n){
  //  recCount++;

    //int [] memo =
        if (n==0){
            return 0;
        }
        if (n==1 || n==2){
            return 1;
        }

        return fib(n-1) + fib(n-2);

    }
}
