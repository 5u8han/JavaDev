import java.util.Scanner;
import java.io.*;
public class FoodApp2 {
    public static void main (String []args) {
        String tempName="";
        int tempCalories =0;
        //Scanner inputText = new Scanner(System.in);
        Food[] FoodArray = new Food[3];
        int i=0;
        try {
            File inputFile = new File("file.txt");
            Scanner input = new Scanner(new File("file.txt"));

            while (input.hasNextLine()) {
                tempName = input.next();
                tempCalories = input.nextInt();

                System.out.println(tempName + " " + tempCalories);
                FoodArray[i] = new Food(tempName,tempCalories);

                i++;
      }
    }
     catch (FileNotFoundException e) {
        System.out.println("No Such File Found: "+ e);
     }
      for (i=0;i<FoodArray.length;i++){
        System.out.println(FoodArray[i]);
     }
 }
}
