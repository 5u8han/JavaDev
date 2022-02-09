import java.util.InputMismatchException;
import java.util.Scanner;

public class Test{
	public static void main(String[]args){
		int min=0, max=0, user=0, count =0,sum=0;
		Scanner input = new Scanner(System.in);

		while(user>0){
			count++;
			System.out.println("Enter Value positive");


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

			}

			catch (InputMismatchException e){
				System.out.println(e);

			}
		}


	}
}