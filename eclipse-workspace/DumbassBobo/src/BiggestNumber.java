/* Subhan Noeman 000623424
 * Professor Sotak
 * Programming I ( CS200)
 * Assignment # 2
 */

import java.util.Scanner;


public class BiggestNumber {


	public static void main(String[] args) {
		
		Scanner something = new Scanner (System.in);
		String FirstName;
		String Lastname;
		String message = "Why choose Programming I?";
		String messageout;
		
		
		System.out.println("Please Input your First Name");
		FirstName = something.nextLine();
		System.out.println("Please Input your Last Name");
		Lastname = something.nextLine();
		System.out.println(message);
		messageout = something.nextLine();
		
		
		System.out.println(FirstName);
		System.out.println(Lastname);
		System.out.println(FirstName +" "+ Lastname);
		System.out.println(messageout);
		
		
	

	}
}