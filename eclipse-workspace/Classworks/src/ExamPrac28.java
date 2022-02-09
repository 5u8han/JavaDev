import java.util.Scanner;

public class ExamPrac28 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner something = new Scanner(System.in);
		System.out.println("Enter first side: ");
		a=something.nextInt();
		
		System.out.println("Enter 2nd side: ");
		b=something.nextInt();
		
		System.out.println("Enter 3rd side: ");
		c=something.nextInt();

		if((a+b)>c & (a+c)>b & (b+c)>a) {
			System.out.println("the sides "+a+", "+b+" and "+c+" can make a triangle");
		}
		else 	
			System.out.println("the sides "+a+", "+b+" and "+c+" do not make a triangle");

	}

}
//a b c
//a+b >c