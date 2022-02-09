public class EmployeeTracingApp
{
   public static void main(String [] args)
   {
      Employee emp1 = new Employee("Howdy", "Doody", 987, 97);
      Employee emp2 = new Employee();
      Employee emp3 = new Employee();
      
      emp3.setFirstName(emp1.getFirstName());
      emp3.setLastName("Gonzalez");
      emp3.setSsn(3);
      
      System.out.println(emp1.toString());
      
      if(emp1.equals(emp3))
         System.out.println("emp1 and emp3 have the same information");
      else
         System.out.println("emp1 and emp3 do not have the same information");
   }
}