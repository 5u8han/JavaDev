/*
Write the main method of a class that asks the user to 
enter three integers a, b, and c. 

After the integers have been entered, the program 
computes the sum. 

If the sum is a multiple of 8 the program 	
displays "red" (unless the last digit of the sum is 
also a 4 or an 8 in which case it should display "blue" 
instead of "red"), 
otherwise the program should display "green". 

The output must be formatted exactly as shown in the example.

*/
import java.util.*;

public class RedBlue {

	public static void main(String[] args) {
		int a,b,c,sum;
		Scanner shit = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		a=shit.nextInt();
		
		System.out.println("Enter 2nd integer: ");
		b=shit.nextInt();
		
		System.out.println("Enter 3rd integer: ");
		c=shit.nextInt();
		sum = (a+b+c);
		
		if ( sum % 8 == 0 || sum% 4==0 ) {

			System.out.println("BLUE");
		
		}
		else if((a+b+c)%8==0 ) {
			System.out.println("RED");
		}
		else System.out.println("GREEN");
	}

}
