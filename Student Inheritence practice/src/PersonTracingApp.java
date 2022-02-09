public class PersonTracingApp
{
   public static void main(String [] args)
   {
      Person p1 = new Person("Howdy", "Doody", 987);
      Person p2 = new Person();
      Person p3 = new Person();
      
      p3.setFirstName(p1.getFirstName());
      p3.setLastName("Gonzalez");
      p3.setSsn(3);
      
      System.out.println(p1.toString());
      
      if(p1.equals(p3))
         System.out.println("p1 and p3 have the same information");
      else
         System.out.println("p1 and p3 do not have the same information");
   }
}