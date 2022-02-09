import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner something= new Scanner (System.in);
		int num1,num2,num3,great1=0,great2=0,great3=0;
		System.out.println("Enter 1st number: ");
		num1=something.nextInt();
		
		System.out.println("Enter 2nd number: ");
		num2=something.nextInt();

		
		System.out.println("Enter 3rd number: ");
		num3=something.nextInt();


		if(num1>num2 & num2>num3 ) {
			great1=num1;
			great2=num2;
			great3=num3;
		}
		else if (num1>num3 & num3 >num2) {
			great1=num1;
			great2=num3;
			great3=num2;
			
		}
		else if (num2>num3 & num3 > num1) {
			great1=num2;
			great2=num3;
			great3=num1;
			
		}
		else if (num2>num1 & num1 > num3) {
			great1=num2;
			great2=num1;
			great3=num3;
			
		}
		
		else if (num3>num1 & num3 > num2) {
			great1=num3;
			great2=num2;
			great3=num1;
			
		}
		else if (num3>num1 && num3 > num2) {
			great1=num3;
			great2=num1;
			great3=num2;
			
		}
		System.out.println(great1+" "+great2+" "+great3);

		}
	}


