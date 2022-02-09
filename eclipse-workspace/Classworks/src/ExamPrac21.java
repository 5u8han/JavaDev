/**
 * @author subhan noeman
 *assignment #4 problem 21
 *
 */
import java.util.Scanner;

public class ExamPrac21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year = input.nextInt();
		System.out.println();
		if (isLeapYear(year) == true) {
			System.out.println("it is a leapyear");
			
		}
		else {System.out.println("Not a Leap Year");}
		
	}
	
	public static boolean isLeapYear(int year) {
		
		
		if ((year % 4 == 0) && year % 100 != 0)
        {
				return true;
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
        {
        		return true;
		}
        else
        {
        	return false;
}
	}

}
/*output
  Enter Year: 
2016

it is a leapyear


  Enter Year: 
1600

it is a leapyear
*/

