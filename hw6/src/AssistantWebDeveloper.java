/* NEIU CS207-1 Spring 2019
 * AssistantWebDeveloper.java
 * 
 * This class represents an employee who is an Assistant Web Developer.
 * For this application, employees who are assistant web developers are
 * always paid an hourly rate (never salaried).
 * 
 * Notice that this class inherits from WebDeveloper, which in turn inherits from Employee.
 */ // Add a class constructor.  How many do you think this class needs?  Just one.
   // Can you make use of the superclass's constructor?  Yes!

public class AssistantWebDeveloper extends WebDeveloper
{
  
		public AssistantWebDeveloper(String firstName, String lastName, int id, String type, double rate, int hours ) {
			
			super(firstName,lastName,id,type, rate, hours);
			
		}
		
   public double calcluatePay(){
	   	double totalPay = super.calculatePay();
	   	return totalPay;
   	}

}
