/**
 * @author subhan noeman
 *assignment #4 problem 38
 *
 */
import java.util.Scanner;

public class ExamPrac38 {

	public static void main(String[] args) {
		int a,b,c, sum;
		Scanner something = new Scanner(System.in);
		System.out.println("Enter an int: ");
		a=something.nextInt();
		
		System.out.println("Enter another one: ");
		b=something.nextInt();
		
		System.out.println("Enter 3rd integer: ");
		c=something.nextInt();
		
	
		sum = a+b+c;
		
		if(sum%5==0 && sum%3==0)  {
			System.out.println(sum*3);
		}
		else if(sum%5==0 || sum%3==0) {
			System.out.println(sum*2);
		}
		else System.out.println(sum);
		
	}

}
/*
Enter an int: 
1
Enter another one: 
12
Enter 3rd integer: 
4
17

Enter an int: 
11
Enter another one: 
2
Enter 3rd integer: 
7
40
*/
