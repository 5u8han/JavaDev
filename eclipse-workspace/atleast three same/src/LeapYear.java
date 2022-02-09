import java.util.Scanner;

public class LeapYear
{
   public static void main(String [] args)
   {
      //variable definitions
      Scanner kbd = new Scanner(System.in);
      int year = 0;
      boolean isLeapYear = false;
      
      //user prompt
      System.out.println("Please enter the year: ");
      year = kbd.nextInt();
      if(isLeapYear(year)==true) {
    	  	
      }
    
      
      
     if(isLeapYear == true)
         System.out.println("the year " + year + " is a leap year.");
      else
         System.out.println("the year " + year + " is not a leap year.");

   
   }
   public static boolean isLeapYear (int y) {
	   
	   if(y%4 == 0) {
		   if(y%100==0) {
		   return true;
		   }
   }
	return false;
   
   
}
   
}

/*

*/