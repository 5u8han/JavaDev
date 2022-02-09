/* NEIU CS207-1 Spring 2019
 * Employee.java
 * An 'employee' can be a Web developer or an assistant Web developer
 * Therefore, type will be either "Hourly" or "Salaried"
 * For this application, Web developers are either Salaried or hourly and Assistant
 * Web developers are always hourly
 * 
 * Will an object of this type (Employee) ever be created in main()?  No.
 * This class exists purely to represent the abstract idea of an 'Employee'
 */
public class Employee
{
   private String firstName; // Employee first name
   private String lastName; // Employee last name
   private int id;  // Employee unique id
   private String type; // Employee type ("Salaried" or "Hourly")

   private double weeklyPay; // Employee total weekly pay
   
   // Class constructor.
   public Employee( String firstName, String lastName, int id, String type )
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.id = id;
      this.type = type;
   }
   
   public double calculatePay()
   {
      return weeklyPay;
   }
   
   // Getter first name 
   public String getFirstName()
   {
      return this.firstName;
   }
   
   // Getter last name
   public String getLastName()
   {
      return this.lastName;
   }
   
   // Getter employee id
   public int getId()
   { 
      return this.id; 
   }
   
   // Getter type ("Salaried" or "Hourly")
   public String getType()
   {
      return this.type;
   }

  
   // The toString() method prints the first and last name of each employee
   @Override
   public String toString()
   {
      return String.format( "%s, %s", this.lastName, this.firstName );
   }
   


   
} // End class
