import java.util.Scanner;

public class BinarySearchNumberofGuesses {
    public static void main(String[] args) {
        int low,high;
        Scanner input = new Scanner(System.in);
        System.out.print("enter Low: ");
        low = input.nextInt();
        System.out.print("\nenter High: ");
        high = input.nextInt();


        System.out.println(search(low,high));
        //System.out.println((int)(Math.log(1024)/Math.log(2)));


    }

    public static int search(int low, int high){
        int temp;
        if (low > high) {
            temp = low;
            low = high;
            high = temp;
        }


        int range = (high - low) +1;

        if (range == 1 || range ==2 ){
            return 1;
        }
        if (range ==3){
            return 2;
        }

        System.out.println("range  "+range);
        System.out.println("number of guesses: ");
        if((Math.log(range)/Math.log(2))%1 ==0){
            return (int) Math.ceil(Math.log(range)/Math.log(2));
        }
        else
        return 1+ (int)Math.floor((Math.log(range)/Math.log(2)));

    }
}
