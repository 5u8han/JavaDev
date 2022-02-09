import java.util.Scanner;

public class ExamPrac4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner something = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		a=something.nextInt();
		
		System.out.println("Enter 2nd integer: ");
		b=something.nextInt();
		
		System.out.println("Enter 3rd integer: ");
		c=something.nextInt();
		if(a>b & b>c) {
			System.out.println("Decreasing");
		}
		else if (a<b &b<c) {
			System.out.println("Increasing");
		
		}
		else if (a==b & b==c) {
			System.out.println("Same");
		}
		else 
			System.out.println("neither");
		
		
	}	

}
