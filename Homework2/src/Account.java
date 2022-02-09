/**
 * @author subhan
 *
 */
public class Account {
		int    ClientID;
		double startBalance;
		double endBalance;
		double interestRate=3.00;
		double earnedInterest;
		String accountType= "Investment";
	/**
	 * 
	 */
	public Account() {
		System.out.println("No-Arg constructor");
	}

	
	public Account(int c, double s, double i) { 
		ClientID = c;
		startBalance = s;
		interestRate = i/100; //interest would be entered as a whole number rather than <1.
	}
	

	public void computeInterest() {
		earnedInterest = interestRate*startBalance;
		endBalance = earnedInterest + startBalance;
		
	}
	
	public void changeAccountType(String t) {
		accountType=t;
	}
	public void printAccountDetails() {
		System.out.println("Account ID: "+ClientID );
		System.out.println("Account Type: "+accountType );
		System.out.println("Starting Account Balance: $"+ startBalance );
		System.out.println("Interest Gained: $"+ earnedInterest);
		System.out.println("Ending Account Balance: $"+ endBalance);
		System.out.println();
	}
	

}
