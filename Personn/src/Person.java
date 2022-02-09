public class Person
{
   private String firstName;
   private String lastName;
   private int id;
   
   public Person(String fn, String ln, int id)
   {
      this.firstName = fn;
      this.lastName = ln;
      this.id = id;
   }
   
   @Override
   public boolean equals(Object obj)
   {
      //null test
      if(obj == null)
         return(false);  //obj is not associated with an object
      //same class test
      if(this.getClass() != obj.getClass())
         return(false); //they are two different object types
         
      //cast parameter address to that of the calling object
      Person otherObject = (Person)obj;
      
      //test parameter by parameter
      if(this.firstName.equals(otherObject.firstName) &&
         this.lastName.equals(otherObject.lastName) &&
         this.id == otherObject.id)
         return(true);
         
      return(false); //note: this is not a part of the "if" condition   
   }
}