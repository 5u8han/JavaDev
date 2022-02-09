import java.util.*;
public class Measurements {

	public static void main(String[] args) {
		Scanner ok = new Scanner(System.in);
		int yard, feet, inch,inchh;
		System.out.println("This program calculates total yards and feet from inches\n\nPlease enter total length in inches: \n(-1) To quit the Program");
		inch= ok.nextInt();
		while( inch !=-1) {
			
		inchh=inch;
		yard = inch/36;
		inch = inch%36;
		feet = inch/12;
		inch = inch%12;
		
		System.out.println("In "+inchh+" inches, There are "+yard+" Yards, "+feet+" Feet and "+inch+" Remaining inches");
		System.out.println("\nPlease enter total length in inches: \n(-1) To quit the Program");
		inch=ok.nextInt();

		}
		
		System.out.println("Program Terminated\nBye!!!");
	}

}
/*This program calculates total yards and feet from inches

Please enter total length in inches: 
(-1) To quit the Program
4421
In 4421 inches, There are 122 Yards, 2 Feet and 5 Remaining inches

Please enter total length in inches: 
(-1) To quit the Program
234
In 234 inches, There are 6 Yards, 1 Feet and 6 Remaining inches

Please enter total length in inches: 
(-1) To quit the Program
55523
In 55523 inches, There are 1542 Yards, 0 Feet and 11 Remaining inches

Please enter total length in inches: 
(-1) To quit the Program
-1
Program Terminated
Bye!!!
*/
