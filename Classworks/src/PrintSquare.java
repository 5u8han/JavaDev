import java.util.Scanner;

public class PrintSquare {
	

	public static void main(String[] args) {
		Scanner input = new Scanner ( System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		printEmptySquare(n);
		
	}
		public static void printEmptySquare (int n) {
			
		for(int row=1;row<=n;row++) {
			for(int column =1;column<=n;column++) {
				if(column==1 || column == n || row ==1 || row==n) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();

		}

	}

}
