/**
 * 
 */

/**
 * @author subhan
 *
 */
public class Employee {

	/**
	 * 
	 */
	
	public String firstName,lastName;
	public double hourlyRate, totalPay;
	 public static int NumberOfEmployees=1;
	
	public Employee(String f, String l) {
		firstName=f;
		lastName=l;
		NumberOfEmployees++;

	}
	public Employee(String f, String l, double h ) {
		firstName=f;
		lastName=l;
		hourlyRate=h;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double getTotalPay() {
		return totalPay;
	}
	public static int getNumberOfEmployees() {
		return NumberOfEmployees;
	}
	
	public  String toString()   
	   {
	      System.out.println("Employee: " +firstName+ " " +lastName);
	      
	      System.out.println("Rate: $"+hourlyRate); 
	      
	      System.out.println("Total Pay: $"+totalPay);
	      
	      System.out.println();
		 return firstName;
		  
	      
	   }
	public void computePay(int n) {
		int numberOfHours =n;
		
		if(numberOfHours<=8) {
			totalPay=hourlyRate*numberOfHours;
		}
		else if (numberOfHours>8) {
			totalPay= (hourlyRate*(1.5))*numberOfHours;
		}


	}


}
