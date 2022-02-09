/* 
 * CS207-1 NEIU Spring 2019
 * This class models a factory that has workers who are paid an hourly wage.
 * A software representation of an Empoloyee at this factory should track it's
 * own name, hourly rate, and total pay data.  Likewise, it needs to be able
 * to calculate it's total pay and provide that information. 
 * 
 * Do not modify this file!
 */
public class Factory
{
   // Begin program exectution
   public static void main( String[] args )
   {
      // Instantiate employees and compute their pay
      Employee e1 = new Employee( "Joe", "Hackett", 16.0 );
      e1.computePay( 10 );
      System.out.println( "Number of employees: " + e1.getNumberOfEmployees() );
      
      Employee e2 = new Employee( "Brian", "Hackett" );
      e2.setHourlyRate( 12.0 );
      e2.computePay( 8 );
      System.out.println( "Number of employees: " + e1.getNumberOfEmployees() );
      
      Employee e3 = new Employee( "Helen", "Chapel", 14.0 );
      e3.computePay( 7 );
      System.out.println( "Number of employees: " + e1.getNumberOfEmployees() );
      
      System.out.println( "Employee e2's hourly rate is: " + e2.getHourlyRate() );
      
      // Print out the data
      System.out.println();
      String e1Details = e1.toString();
      String e2Details = e2.toString();
      String e3Details = e3.toString();
      
      System.out.println( e1Details );
      System.out.println( e2Details );
      System.out.println( e3Details );

   } // End main()
   
} // End class Factory
