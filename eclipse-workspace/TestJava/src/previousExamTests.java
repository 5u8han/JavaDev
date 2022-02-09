import java.util.Scanner;

public class previousExamTests {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("enter integer n: ");
		int n=m.nextInt();
		System.out.println("enter integer k: ");
		int k = m.nextInt();
		
		
		
		for (int i=k;i>0;i--) {
			
			for(int j =1;j<=i;j++) {
				
				System.out.print(n+" ");	
			}
			
			System.out.println();
			n--;
		
		}

	}

}
