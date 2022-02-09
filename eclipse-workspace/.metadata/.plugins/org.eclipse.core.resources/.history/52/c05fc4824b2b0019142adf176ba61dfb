public class Employee
{

   private String firstName;
   
   private String lastName;
   
   private double hourlyRate;
   
   private double totalPay;
  
   int numberOfEmployees = 0;
   
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

   public double gethourlyRate()
   {
      return hourlyRate;
   }
   
   public void sethourlyRate( double hourlyRate)
   {
      this.hourlyRate = hourlyRate;
   }
   
   public double gettotalPay()
   {
      return totalPay;
   }
   
   public int numberOfEmployees()
   {
      return numberOfEmployees;
   }
  
   //method 1
   public void toString()   //returns a string
   {
      // should not print???
      System.out.print("Employee: " +firstName+ " " +lastName);
      
      System.out.println("Rate: $"+hourlyRate); 
      
      System.out.println("Total Pay: $"+totalPay);
      
      System.out.println();  
      
      //return statement error here  
   }
   
   //method 2
   public void computePay() //returns nothing, takes in hours worked from main
   {
      if(hourlyRate < 8)
      {
         totalPay = computePay * hourlyRate;
      }
      
      if(hourlyRate > 8)
      {
         totalPay = computePay * (hourlyRate * 1.5);
      }
   
   }
}