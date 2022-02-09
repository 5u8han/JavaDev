import java.util.Scanner;

public class PennyDown {

	public static void main(String[] args) {
		int penny, dime, nickel, quarter, remainingChange;
		Scanner input=new Scanner(System.in);
		System.out.println("enter penny");
		penny= input.nextInt();
		
		quarter = penny/25;
		remainingChange = penny%25;
		dime = remainingChange/10;
		remainingChange = remainingChange%10;
		nickel = remainingChange/5;
		remainingChange=remainingChange%5;
		
		System.out.println(quarter+"quater");
		System.out.println(nickel+"nickel");
		System.out.println(dime+"dime");
		System.out.println(remainingChange+"penny");
		
	}

}
