import java.util.*;
import java.io.*;
public class BookPrices
{
   public static void main( String[] args )
   {
      double total = 0.0;
      File file = new File("books.txt");
      Scanner filer = null;
      double sum=0.0;
      double n = 0.0;
      String title=" ";

      // Use a loop in the try block to read each line of the file.
      // Lecture Slides 13 (posted on D2L) provide a good example
      try
      {
    	  filer = new Scanner(file);
    	  n = filer.nextDouble();
    	  
    	  
          while(filer.hasNext())
          {
             total = total + filer.nextDouble();
          }

    	  }

      
      catch( FileNotFoundException e)
      {
    	  System.out.println("File not found, Please place file in correct directory");
      }
      finally
      {
       
      }
      System.out.println( "The total value is: $" + total );
   }

}