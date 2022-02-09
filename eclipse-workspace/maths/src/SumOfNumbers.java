/* Subhan Noeman 000623424
 * Professor Sotak
 * Programming I ( CS200)
 * Assignment # 2
 */
import java.util.Scanner;
 

public class SumOfNumbers {

	public static void main(String[] args)  {
		int n;
		int x;
		
		Scanner alphabet = new Scanner(System.in);
		
		
		System.out.println(" This program calculates the sum of number using formula  n(n+1)/n\n");
		System.out.println(" Chose a Number between 1 and 100 inclusive: ");
		n = alphabet.nextInt();
		
		
		while(n>100 || n<1) {
			System.out.println("Number out of bounds \n\nPlease choose a number between 1 and 100 inclusive");
			n=alphabet.nextInt();
		}
		
		x= (n*(n+1))/2;
		System.out.println("The sum of the numbers between 1 and " +n+ " is: " + x+"\n\nEnd Program");
		
		
	}

}
// output: 
/*This program calculates the sum of number using formula  n(n+1)/n
*
*Chose a Number between 1 and 100 inclusive: 
*42
*The sum of the numbers between 1 and 42 is: 903
*
*End Program
*/

