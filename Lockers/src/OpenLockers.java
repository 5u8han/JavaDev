
public class OpenLockers {
	
	public static void main(String args[]) {
		System.out.println("How many lockers were left open\nby the time bobo got home: ");
		
		int lockers=1000, num1=0, num2=1;
		
		
		while( num2<lockers) {
			num1++;
			num2 = num1*num1;
		}
		
		
		
		num1--;
		
		System.out.println(num1+" lockers");
	}

}
