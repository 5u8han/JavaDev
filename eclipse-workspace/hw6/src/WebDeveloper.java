/* NEIU CS207-1 Spring 2019
 * WebDeveloper.java
 * 
 * This class represents an employee who is a Web Developer.
 * For this application, employees who are web developers are paid either 
 * a fixed salary, or an hourly rate.
 */
public class WebDeveloper extends Employee
{
   // Add private instance variables weeklySalary, hourlyRate, and hours
		private double weeklySalary;
		private double hourlyRate;
		private int hours;
   
   // Complete the constructor which assigns values to all the instance variables in Employee.java and
   // includes one for weekly salary.  Use the super() keyword to call the superclass constructor
   public WebDeveloper( String firstName, String lastName, int id, String type, double salary )
   {
	   super(firstName,lastName,id,type);
	   this.weeklySalary=salary;

   }
   
   // Complete this overloaded constructor which is very similar, but instead of a weekly salary
   // it includes a parameter for hourly rate and an int for the number of hours worked
   // Use the super() keyword to call the superclass constructor
	   public WebDeveloper( String firstName, String lastName, int id, String type, double rate, int hours )
	   {
		   	super(firstName,lastName,id,type);
		   	this.hourlyRate=rate;
		   	this.hours=hours;
	   }  
   

		   	public void setHours( int hours ){
		      this.hours = hours;
		   	}
		   
		    
		   public double getHourlyRate() {
			return hourlyRate;
		}

			public int getHours() {
				return hours;
			}

// Implement(override) the method calculatePay() for a Web Developer.  Remember, a Web developer could
   // be paid a fixed salary or paid by the hour.  How would you tell the difference?  Or rather, which
   // getter would you call to find out?
   @Override
   public double calculatePay(){
	   String employeeType = getType();
	   double totalPay = 0;
	   
	   if(employeeType.equals("Hourly")) {
		   totalPay = this.getHourlyRate()*this.hours;
	   }
	   else {
		   totalPay = weeklySalary;
	   }
	   		
	   		return totalPay;
   }
   
}
