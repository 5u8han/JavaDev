import java.util.Scanner;

public class atleaseThreeSame {

	public static void main(String[] args) {
		boolean threeMatch = false;
		System.out.println();
		Scanner something = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Please enter an Integer");
		a= something.nextInt();
		System.out.println("Please enter an Integer");
		b= something.nextInt();
		System.out.println("Please enter an Integer");
		c=something.nextInt();
		System.out.println("Please enter an Integer");
		d=something.nextInt();
		
		if (a==b && a==c & a==d) { //all numbers same
			System.out.println(" All numbers are the same");
		}
		else if (b==c && b==d) { //a is different
			System.out.println("true");
		}
		else if (a==c && a==d) {// b is different
			System.out.println("true");
		}
		else if (a==b && a==d) {// c is different
			System.out.println("true");
		
		}
		else if (a==b && a==c) { // d is different 
			System.out.println("true");
		}
		else 
			System.out.println("false");
	}

}
