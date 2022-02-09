/**
 * @author subhan
 *
 */
public class CastleRockDemo {

	/**
	 * 
	 */
	public CastleRockDemo() {
		// TODO  constructor stub
	}


	public static void main(String[] args) {
		// TODO  method stub
		
		Account account1 = new Account(100,821.00,3.0);
		account1.computeInterest();
		account1.printAccountDetails();
		
		Account account2=new Account(200,1250.00,2.4);
		account2.computeInterest();
		account2.printAccountDetails();
		
		Account account3=new Account(300,320.00,1.9);
		account3.computeInterest();	
		account3.printAccountDetails();
		
	}

}
