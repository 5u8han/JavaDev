import java.util.Scanner;

public class DollarDown {
            

   public static void main (String[] args) {
	   int remainingChange, half, quater,dime,nickel, penny;
	   double change;
	   

      System.out.println("This program will convert your change in the piggybank into Half Dollars, quaters, dimes and pennies ");

      
      System.out.println("Please enter the total dollar amount in the piggy bank: ");
      Scanner another = new Scanner(System.in);
      change = another.nextDouble();
      remainingChange=(int)(change*100);
      
      
      half=remainingChange/50;
      remainingChange=remainingChange%50;
      
      quater= remainingChange/25;
      remainingChange= remainingChange %25;
      
      dime=remainingChange /10;
      remainingChange= remainingChange %10;
      
      nickel = remainingChange/5;
      remainingChange = remainingChange%5;
      
      penny = remainingChange/1;
      remainingChange= remainingChange%1;
      
      
      

      System.out.print("For your total Change of $" + change+" Dollars ");
      System.out.print("You have " + half +" Half Dollars ");
      System.out.print( quater+ " Quaters ");
      System.out.print( dime+" dimes ");
      System.out.print(nickel+ " Nickels ");
      System.out.print("and "+penny+" Pennies");    
   }
}
/*output
* This program will convert your change in the piggybank into Half Dollars, quaters, dimes and pennies 
*Please enter the total dollar amount in the piggy bank: 
*69.42
*For your total Change of $69.42 Dollars You have 138 Half Dollars 1 Quaters 1 dimes 1 Nickels and 2 Pennies
* 
*/