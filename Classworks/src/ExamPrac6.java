import java.util.Scanner;

public class ExamPrac6 {

	public static void main(String[] args) {
		
		int a,b,c,odd=0;
		Scanner something = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		a=something.nextInt();
		
		System.out.println("Enter 2nd integer: ");
		b=something.nextInt();
		
		System.out.println("Enter 3rd integer: ");
		c=something.nextInt();
		
		if(a%2==1) {
			odd++;
			
		}
		if(b%2==1) {
			odd++;
		}
		if(c%2==1) {
			odd++;
		}
	System.out.println("there are "+odd+" odd numbers");

	}

}
