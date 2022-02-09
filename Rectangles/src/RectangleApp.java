import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RectangleApp {
    public static void main(String [] args)  {
        ArrayList <Rectangle> rectangleArrayList = new ArrayList<>();
        try {
            Scanner inputFile = new Scanner(new File("rectangleData.txt"));

            while (inputFile.hasNextLine()) {

                Rectangle r1 = new Rectangle(inputFile.nextInt(), inputFile.nextInt());
                rectangleArrayList.add(r1);
                r1.calculateArea();

            }

        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found\n"+e);
        }
                System.out.println("The objects in the array are: ");
        for (Rectangle newR : rectangleArrayList){
            System.out.println(newR);
            System.out.println();
        }

    }
}
