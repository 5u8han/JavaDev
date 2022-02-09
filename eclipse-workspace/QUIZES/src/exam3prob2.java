import java.util.InputMismatchException;
import java.util.Scanner;

public class exam3prob2{
	public static void main(String[]args){
		int min=0, max=0, user=0, count =0,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Value positive");

		while(user>=0){
			count++;
			


			try{

				user= input.nextInt();
				if(user>max){
					max = user;
					sum+=user;
					if(count == 1){
						min=user;
						sum+=user;
					}
				}
				
				System.out.println("Sum: "+sum);

			}

			catch (InputMismatchException e){
				System.out.println("exception occoured");
				break;

			}
		}


	}
}