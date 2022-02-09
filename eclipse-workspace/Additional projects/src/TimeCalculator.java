import java.util.Scanner;

public class TimeCalculator {

	public static void main(String[] args) {
		Scanner everything = new Scanner(System.in);
		System.out.println("Please enter the total amount of time in seconds: \n(-1) To end the program");
		int seconds ;
		seconds = everything.nextInt();
		int inputtedSeconds=seconds;
		while (seconds !=-1) {
					
		int days = seconds / 86400;
		seconds = seconds%86400;
		int hour = seconds/3600;
		seconds = seconds%3600;
		int minutes = seconds/60;
		seconds = seconds%60;
		
		System.out.println("In "+inputtedSeconds+" Seconds, there is/are "+days+" Day(s), "+hour+" Hour(s) "+minutes+" Minute(s) and remaining "+seconds+" Second(s)\n\n");
		System.out.println("Please enter the total amount of time in seconds: \n(-1) To end the program");
		seconds=everything.nextInt();
		
		}
		
		System.out.println("Program Terminated\nBye!!!");
	}

}
/*Please enter the total amount of time in seconds: 
(-1) To end the program
12345
In 12345 Seconds, there is/are 0 Day(s), 3 Hour(s) 25 Minute(s) and remaining 45 Second(s)


Please enter the total amount of time in seconds: 
(-1) To end the program
-1
Program Terminated
Bye!!!
*/