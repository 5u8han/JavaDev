import java.util.Scanner;

public class ExamPrac12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,max;
		int count=0;
		Scanner something = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		a=something.nextInt();
		
		System.out.println("Enter 2nd integer: ");
		b=something.nextInt();
		
		System.out.println("Enter 3rd integer: ");
		c=something.nextInt();
	
	      
	      //find max value
	      if(a >= b && a >= c)
	      {
	         max = a;
	      }
	      else if(b >= a && b >= c)
	      {
	         max = b;  
	      }
	      else
	      {
	         max = c; 
	      }
	      //count occurrences of the max value
	      if(max == a)
	      {
	         count++;
	      }
	      if(max == b)
	      {
	         count++;
	      }
	      if(max == c)
	      {
	         count++;
	      }
	      
	      //program output
	      System.out.println("The largest number " + max + " was entered " + count + " time(s).");




	   }
	}
