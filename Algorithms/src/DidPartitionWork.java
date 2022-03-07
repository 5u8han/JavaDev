import java.util.Scanner;

public class DidPartitionWork {
    public static void main(String[] args) {
        System.out.println("welcome\n This program figures out if an input follows a certain partition");

        int pivvot =0, pivvotIndex =-1;
        boolean flag =false;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of numbers to be entered: ");

        int [] array  = new int[input.nextInt()];

        System.out.println("Now enter each integer and hit enter: ");
        for(int i=0; i< array.length; i++){
            array[i] = input.nextInt();
            System.out.println("Next: ");

        }

        for(int i=1; i< array.length; i++){
            if(flag ==true){
                if(pivvot < array[i]){
                    continue;
                }
                else
                {
                    pivvot =0;
                    flag =false;
                    pivvotIndex =-1;
                }
            }

            if(array[i]> array[i-1]){
                pivvotIndex =i;
                pivvot = array[i];
                flag = true;
            }

        }
        for(int i =0; i<pivvotIndex ; i++){
            if(array[i] >= pivvot){
                flag = false;
            }

        }
        for(int i = array.length -1 ; i > pivvotIndex ; i--) {
            if (array[i] <= pivvot) {
                flag = false;
            }
        }
        if(flag ==false){
            System.out.println("Not working");
        }

        else System.out.println("Possibly working");

    }
}
