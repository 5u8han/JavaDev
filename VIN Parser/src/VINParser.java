import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VINParser {
    public static void main(String args[]){
        try {
            Scanner input = new Scanner( new File("Vinput.text"));

        }
        catch (FileNotFoundException e){
            System.out.println("File not Found");
        }
    }
}
