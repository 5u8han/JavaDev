import java.util.Scanner;

public class previousExamTestss {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("enter integer n: ");
		int n=m.nextInt();
		
		
		
		for (int i =1;i<=n;i++) {
			
			System.out.print("Line "+i+": ");

			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print(i+" ");
				}
				
					System.out.print(j+" ");
				
				
			}
			System.out.println();
		
			
		}
		
	}

}
