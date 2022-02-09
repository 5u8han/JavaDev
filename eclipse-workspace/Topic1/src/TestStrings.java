/*
 * CS207-1 Spring 2019 Homework 5
 * NEIU
 * This class is a test class for StringConverter.java
 */
import java.util.Arrays;
public class TestStrings
{
   public static void main( String[] args )
   {
      char[][] x = { {'S', 'p', 'r', 'i', 'n', 'g' },
                     {' ', 'a', 't', ' ', 'N', 'E',},
                     {'I', 'U', ' ', 'h', 'a', 's' },
                     {' ', 'b', 'e', 'e', 'n', ' '},
                     {'v', 'e', 'r', 'y', ' ', 'c'},
                     {'o', 'l', 'd', '!' }
                    };
   
      StringConverter sc1 = new StringConverter( x );
      String result = sc1.createString();
      System.out.println( result );
      
      String test = "JAVA-IS-VERY-FUN";
      StringConverter sc2 = new StringConverter( test );
      char[][] r = sc2.createCharArray();
      
      for( int row = 0; row < r.length; row++ )
      {
         for( int col = 0; col < r[row].length; col++ )
         {
            System.out.print( r[row][col] );
         }
         System.out.println();
      }
        
   }
}