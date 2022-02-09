import java.util.*;
import java.io.*;
public class BookPrices
{
   public static void main( String[] args )
   {
      double total = 0.0;
      Scanner inputFile = null;
      File file = new File("books.txt");
      // Use a loop in the try block to read each line of the file.
      // Lecture Slides 13 (posted on D2L) provide a good example
      try
      {
      inputFile = new Scanner(file);
      while(inputFile.hasNext())
      {
         String s = inputFile.next();
         total = total + inputFile.nextDouble();
      }
      System.out.println("Calculating total value in the portfolio:");
      }
      catch( FileNotFoundException ex )
      {
          System.out.println("File not found");
      }
      finally
      {
      
      }
      System.out.println( "The total value is: $" + total );
   }

}