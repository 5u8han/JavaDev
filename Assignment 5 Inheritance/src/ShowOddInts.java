import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ShowOddInts {
    public static void main(String args[]){
        try {
            Scanner input = new Scanner(new File("nums.txt"));
            while (input.hasNext()){
                int i = input.nextInt();
                if (i % 2 == 1){

                    System.out.println(i);
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("no file "+e);
        }
    }
}
