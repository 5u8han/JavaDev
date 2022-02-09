/*
Subhan Noeman - 623424
Professor Sotak
Programming 207 - Assignment #2
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ReadCountries {
    public static void main(String[] args) {

        int largest =0, smallest =0, largestIndex=0, smallestIndex=0;
                                                                                      
     try {

         Scanner inputFile = new Scanner(new File("Countries.txt"));
         ArrayList<Country> A1 = new ArrayList<>();      // syntax to create an arrayList with object of Country

         while (inputFile.hasNext()) {

             String name = inputFile.next();
             int population = inputFile.nextInt();
             String capital = inputFile.next();

             Country c1 = new Country(name, population, capital); // creating object and passing input to constructor
             A1.add(c1);         //adding object into array List
         }

         //Following method & how to use, was grabbed from docs.java.io
         //used to compare values and return a sequence which i used to get ascending or descending order

         Collections.sort(A1, new Comparator<Country>() {
             @Override
             public int compare(Country c1, Country c2) {
                 return Integer.valueOf(c1.getPop()).compareTo(c2.getPop());
             }
         });

         //The following will print out objects in array list as is since its already arranged
         // in the Collections.sort method

         for (int i = 0; i < A1.size(); i++) {
             System.out.println("Name: " + A1.get(i).getName() + " Population: " + A1.get(i).getPop() + " Capital: " +
                     A1.get(i).getCapital());
         }

         //Following section to calculate smallest and largest values from the ArrayList
         smallest = A1.get(0).getPop();

         for (int i = 0; i < A1.size(); i++) {

             if (A1.get(i).getPop() > smallest) {
                 largest = A1.get(i).getPop();
                 largestIndex = i;
             }
             if (A1.get(i).getPop() < largest) {
                 smallest = A1.get(i).getPop();
                 smallestIndex = i;
             }
         }
         System.out.println();
         System.out.print("Country with largest population is:\n" + A1.get(largestIndex).toString());
         System.out.print("Country with Smallest population is:\n" + A1.get(smallestIndex).toString());

         /*Here i could have implemented .getName() and getPop() to match the exact output
But since the .toString() method was feeling alone, I gave him a purpose in life lol. using it was easier
But here is the code to match assignment output.

System.out.print("Country with Smallest population is:\n"+A1.get(smallestIndex).getName()+" Population: "+
                 A1.get(smallestIndex).getPop());
System.out.print("Country with Largest population is:\n"+A1.get(largestIndex).getName()+" Population: "+
                 A1.get(largestIndex).getPop());
 */

     }
     catch (FileNotFoundException e){
         System.out.println("File not found: \n"+e);
     }
    }
}
// I HAVE NOT YET BEEN EXPOSED TO printf COMMAND. IS THE REASON WHY MY OUTPUT IS NOT ALIGNED.