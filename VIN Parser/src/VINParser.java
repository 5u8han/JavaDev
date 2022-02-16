import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VINParser {
    public static void main(String args[]){
        try {
            Scanner input = new Scanner( new File("Vinput.text"));
            System.out.println("input a VIN: ");
            String vin = input.nextLine().toUpperCase;

            //Parsing

            int country = vin.substring(0);
        }
        catch (FileNotFoundException e){
            System.out.println("File not Found");
        }
    }
}
