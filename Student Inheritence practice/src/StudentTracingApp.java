public class StudentTracingApp
{
   public static void main(String [] args)
   {
      Student s1 = new Student("Howdy", "Doody", 987, 97);
      Student s2 = new Student();
      Student s3 = new Student();
      
      s3.setFirstName(s1.getFirstName());
      s3.setLastName("Gonzalez");
      s3.setSsn(3);
      
      System.out.println(s1.toString());
      
      if(s1.equals(s3))
         System.out.println("s1 and s3 have the same information");
      else
         System.out.println("s1 and s3 do not have the same information");
   }
}