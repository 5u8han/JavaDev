//Kennedy Hach
//207 - 5
//Assignment 1

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class ReadCountries
{
   public static void main(String[] args)
   {
      ArrayList<Country> countryArray = new ArrayList<Country> ();
      
         try
       {
         Scanner fScanner = new Scanner(new File("Countries.txt"));
         
         while(fScanner.hasNextLine())
         {
            Country c = new Country(fScanner.nextLine(),fScanner.nextInt(), fScanner.nextLine());
            countryArray.add(c);
         }
       }
         catch(FileNotFoundException fnf)
         {
            System.out.println("No file " + fnf);
         }
         
         for(Country newC : countryArray)
         {
            System.out.print(newC);
            System.out.println();
         }
   }
}