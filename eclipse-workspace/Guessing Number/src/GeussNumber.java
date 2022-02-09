import java.util.Random;
import java.util.Scanner;

public class GeussNumber {

	public static void main(String[] args) {
		
		   Random randomNumbers =new Random();
		   Scanner input = new Scanner(System.in);
		   
		   int tries = 0, success = 0, userGuess =0;
		   
		   int winNum = randomNumbers.nextInt(99);
		   
		   winNum++;
		   
		   while(success == 0)
		      {
		     System.out.println("Please enter a number between 1 and 100: ");
		     userGuess =input.nextInt();
		     System.out.println(userGuess);
		         if( userGuess<1 || userGuess>100)
		         {
		         System.out.println("Number out of range, Please enter a number between 1 and 100: ");
		         tries++;
		         }
		         if(userGuess == winNum)
		         {
		         tries++;
		         success = 9001;
		         System.out.println("Congratulations!!\n");
		         System.out.println("You guessed the correct number "+winNum+" in " +tries +" tries");
		         }
		         else if(userGuess < winNum)
		         {
		         tries++;
		         System.out.println("The number you entered is Too low, Please try again: ");

		         }
		         else
		         {
		         tries++;
		         System.out.println("The number you entered is Too high, Please try again: ");
		         
		         }
		      }
		   
		   }
		}
