import java.util.Scanner;

public class power {
	public static void main(String args[]) {
		
		int power,number=0, a, b,c,d,i,prod;
		Scanner input = new Scanner(System.in);
		System.out.println("enter number: ");
		number = input.nextInt();
		System.out.println("enter power: ");
		power = input.nextInt();
		
		for (i=1, prod=1; i<=power;i++) {
			prod=prod*number;
		}
		
		System.out.println(prod);
	}

}
