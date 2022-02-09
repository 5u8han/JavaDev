public class Employee
{

   private String firstName;
   
   private String lastName;
   
   private double hourlyRate;
   
   private double totalPay;
  
   int numberOfEmployees = 0;
   int hours = 0;
   
   int Employee = numberOfEmployees; 
   
   int computePay;
   
   //constructor 
   public Employee(String firstName, String lastName)   
   {
      this.firstName = firstName; //set instance variable accordingly 
      this.lastName = lastName;
      numberOfEmployees++; 
   }
   
   //constructor 
   public Employee(String firstName, String lastName, double hourlyRate)   
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.hourlyRate = hourlyRate;
      numberOfEmployees++; 
   }

 
   public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
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

public void setTotalPay(double totalPay) {
	this.totalPay = totalPay;
}

public int getNumberOfEmployees() {
	return numberOfEmployees;
}

public void setNumberOfEmployees(int numberOfEmployees) {
	this.numberOfEmployees = numberOfEmployees;
}

public int getHours() {
	return hours;
}

public void setHours(int hours) {
	this.hours = hours;
}

public int getComputePay() {
	return computePay;
}

public void setComputePay(int computePay) {
	this.computePay = computePay;
}

//method 1
   public  String toString()   //returns a string
   {
      // should not print???
      System.out.print("Employee: " +firstName+ " " +lastName);
      
      System.out.println("Rate: $"+hourlyRate); 
      
      System.out.println("Total Pay: $"+totalPay);
      
      System.out.println();
	return firstName;  
      
      //return statement error here  
   }
   
   //method 2
   public void computePay(int i) //returns nothing, takes in hours worked from main
   {
	   totalPay=i;
      if(hourlyRate < 8)
      {
         totalPay = hourlyRate * hours;
      }
      
      if(hourlyRate > 8)
      {
         totalPay = computePay * (hourlyRate * 1.5);
      }
   
   }
}