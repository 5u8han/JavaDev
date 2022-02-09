/**
 * @author subhan noeman
 *assignment #4 problem 41
 */

import java.util.Scanner;

public class ExamPrac41 {

	public static void main(final String[] args) {
		int a,b,c,sum;
	 Scanner something = new Scanner(System.in);
		System.out.println("Enter a: ");
		a=something.nextInt();
		
		System.out.println("Enter b: ");
		b=something.nextInt();
		
		System.out.println("Enter c: ");
		c=something.nextInt();
		sum=a+b+c;
		if (sum%8==0) {
			if(sum%10 == 4 || sum%10 ==8) {
				System.out.println("BLUE");
			}
				else 
					System.out.println("RED");
		}
		else System.out.println("GREEN");
		
	}

}
/*
Enter a: 
3
Enter b: 
11
Enter c: 
4
GREEN
------------------------------
Enter a: 
20
Enter b: 
3
Enter c: 
1
BLUE


*/