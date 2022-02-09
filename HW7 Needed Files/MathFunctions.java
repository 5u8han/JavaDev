import java.util.*;
public class MathFunctions
{

	Scanner WWWWWWWWWWWWWW = new Scanner(System.in);
	int div=0,mod=0, i=0, n=0, a,b;
   public void divide()
   {

	 try
      {
    	 
		
    	 System.out.println("Enter the numrator: ");
    	 a=WWWWWWWWWWWWWW.nextInt();
    	 
    	 System.out.println("Enter the divisor: ");
    	 b=WWWWWWWWWWWWWW.nextInt();
    	 
    	 div = a/b;
    	 mod = a%b;
    	 System.out.println(a+" / "+b+" is "+div+" With a remainder of "+mod);
    	

    	 
    	 
      }
      catch( ArithmeticException zero )
      {
    	  System.out.println("Enter a different number for the denominator, cannot devide by zero");
    	  WWWWWWWWWWWWWW.nextLine();
      }
      catch( InputMismatchException shit )
      {
    	  System.out.println("invalid input type, Run program again ");
    	  WWWWWWWWWWWWWW.nextLine();
      }
   
   
	 }
	
  
   
   
   public static void main( String[] args )
   {
      // Test it here in main, when ready
      MathFunctions functions = new MathFunctions();
     
      functions.divide();
      
      
   }
   



}
