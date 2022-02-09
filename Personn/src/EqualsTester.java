public class EqualsTester
{
   public static void main(String [] args)
   {
      Person mary = new Person("Mary", "Smith", 3416);
      Person joe = new Person("Joe", "Smith", 1234);
      Person joe2 = new Person("Joe", "Smith", 1313);
      Person michelle = new Person("Mary", "Smith", 3416);
      
      Student mary2 = new Student("Mary", "Smith", 3416);
      
      System.out.println("mary equals joe: " + mary.equals(joe));
      System.out.println("joe equals joe2: " + joe.equals(joe2));
      System.out.println("mary equals michelle: " + mary.equals(michelle));
      System.out.println("mary equals mary2: " + mary.equals(mary.equals(mary2)));
   }
}

/*PROGRAM OUTPUT

   mary equals joe: false
   joe equals joe2: false
   mary equals michelle: true
   mary equals mary2: false
   
*/