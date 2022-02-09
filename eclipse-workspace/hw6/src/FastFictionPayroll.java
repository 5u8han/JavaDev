/* NEIU CS207-1 Spring 2019
 * FastFictionPayroll.java
 * This class represents the Fast Fiction Books weekly payroll system.  It contains
 * the main() method and is the test program for Employee.java, WebDeveloper.java,
 * AssistantWebDeveloper.java.
 *
 * Do not modify this class!
 * Ensure this and the other three classes mentioned above are located in the same folder.
 */
public class FastFictionPayroll
{
   public static void main( String[] args )
   {
      // Class constants
      final double WEEK = 100.0;
      final String SAL = "Salaried";
      final String HOUR = "Hourly";
      
      // Create salaried Web Developer employees
      WebDeveloper emp1 = new WebDeveloper("Antonio", "Scarpacci", 120, SAL, 925.0  );
      WebDeveloper emp2 = new WebDeveloper("Lowell", "Mather", 121, SAL, 850.0 );
      WebDeveloper emp3 = new WebDeveloper("Stewart", "Parks", 122, SAL, 900.0 );
      WebDeveloper emp4 = new WebDeveloper("Maryam", "Morgan", 123, SAL, 930.0 );
      WebDeveloper emp5 = new WebDeveloper("Lowell", "Mather", 121, SAL, 1000.0  );
      WebDeveloper emp0 = new WebDeveloper("Maryam", "Morgan", 124, SAL, 930.0 );
      
      // Create hourly Web Developer employees
      WebDeveloper emp6 = new WebDeveloper("Frasier", "Crane", 125, HOUR, 18.0, 9 );
      WebDeveloper emp7 = new WebDeveloper("Pedro", "Sanchez", 126, HOUR, 20.0, 21 );
      WebDeveloper emp8 = new WebDeveloper("Marty", "Crane", 127, HOUR, 20.0, 18 );
      WebDeveloper emp9 = new WebDeveloper("Cedric", "Branson", 128, HOUR, 21.0, 10 );
      WebDeveloper emp10 = new WebDeveloper("Julia", "West", 129, HOUR, 19.0, 16 );
      WebDeveloper emp11 = new WebDeveloper("Vanessa", "Diego", 1210, HOUR, 18.0, 20 );
      
      // Create Assistant Web Developer employees
      AssistantWebDeveloper emp12 = new AssistantWebDeveloper("Lee", "Davis", 1211, HOUR, 12.0, 9 );
      AssistantWebDeveloper emp13 = new AssistantWebDeveloper("Jackson", "Mills", 1213, HOUR, 14.0, 10 );
      AssistantWebDeveloper emp14 = new AssistantWebDeveloper("Leslie", "Harris", 1214, HOUR, 12.0, 20 );
      AssistantWebDeveloper emp15 = new AssistantWebDeveloper("Alex", "Wentor", 1215, HOUR, 16.0, 14 );
       
      // Test the equals() method
      boolean b1 = emp2.equals(emp5);
      boolean b2 = emp5.equals(emp2);
      boolean b3 = emp3.equals(emp5);
      boolean b4 = emp5.equals(emp0);
      boolean b5 = emp7.equals(emp10);  
      boolean b6 = emp11.equals(emp11);  
      
      System.out.println( "Testing the equals() method: " );
      System.out.println( "emp2 is the same as emp5? " + b1 ); // true
      System.out.println( "emp5 is the same as emp2? " + b2 ); // true
      System.out.println( "emp3 is the same as emp5? " + b3 ); // false
      System.out.println( "emp5 is the same as emp0? " + b4 ); // false 
      System.out.println( "emp7 is the same as emp10? " + b5 ); // false
      System.out.println( "emp11 is the same as emp11? " + b6 ); // true
      System.out.println(); 
      
       // Create the Employee database array (notice the data type of the array)
      Employee[] database = new Employee[15];
      database[0] = emp1;
      database[1] = emp2;
      database[2] = emp3;
      database[3] = emp4;
      database[4] = emp5;
      database[5] = emp6;
      database[6] = emp7;
      database[7] = emp8;
      database[8] = emp9;
      database[9] = emp10;
      database[10] = emp11;
      database[11] = emp12;   
      database[12] = emp13;
      database[13] = emp14;
      database[14] = emp15;

      // Test calculatePay() for all employees
      System.out.println( "Testing calculatePay(): " );
      double weeklyPay;
      String output;
      for( int index = 0; index < database.length; index++ )
      {
         weeklyPay = database[index].calculatePay();
         output = String.format( "%s, $%.2f", database[index].toString(), weeklyPay );
         System.out.println( output );
      }    
   }
}