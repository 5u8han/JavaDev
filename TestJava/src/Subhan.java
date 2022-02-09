import java.util.Scanner;
/**
 * @author subhan
 *
 */
public class Subhan {

	public static void main(String[] args) {
		
		
		Scanner something = new Scanner(System.in);
		System.out.println("Enter n: ");
		int c=something.nextInt();
		
		for (int i=0;i*i<c;i++) {
			for (int j=0;j*j<=c;j++) {
			if(i*i+ j*j==c) {
				
				System.out.println("the number "+c+" has two perfect squares: "+ i+" and "+ j);
				
				}			
			}

    	}	
	}	
}
