import java.util.Scanner;

public class OutputSeperateLine {

	public static void main(String[] args) {
		Scanner something=new Scanner(System.in);
		System.out.println("enter a 4 digit number: ");
		
		int number = something.nextInt();
		
		
		while (number<1000 || number > 9999) {
			
			System.out.println("Out of bounds\nEnter a 4 digit number");
			
			 number= something.nextInt();
			 

		}
		 
		
	    System.out.println (number / 1000);
	    number = number%1000;
	    
	    System.out.println(number/100);
	    number=number%100;
	    
	    System.out.println(number/10);
	    number=number%10;
	    
	    System.out.println(number/1);
	    
	    System.out.println("\nProgram Ended");


	    
	}

}
/*enter a 4 digit number: 
0000
Out of bounds
Enter a 4 digit number
4352
4
3
5
2

Program Ended

 */
