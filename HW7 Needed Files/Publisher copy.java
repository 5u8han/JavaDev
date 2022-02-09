/* 
 * CS207-1 Programming 2, Spring 2019
 * This class will serve as a software representation of a Publisher for Fast Fiction Books.
 * It's attributes and behaviors should accurately reflect an instance of a Publisher for the 
 * Fast Fiction model company.  
 */
public class Publisher
{
   // Publisher attributes
   private String publisherName;
   private String publisherCity;
   private String publisherSpecialty;
   
   // Publisher constructor
   public Publisher( String name, String city, String specialty )
   {
      this.publisherName = name;
      this.publisherCity = city;
      this.publisherSpecialty = specialty;
   }
   
   // Publisher behaviors
   public String getPublisherName()
   {
      return publisherName;
   }
   
   public String getPublisherCity()
   {
      return publisherCity;
   }
   
   public String getPublisherSpecialty()
   {
      return publisherSpecialty;
   }
   
   /* Properly override the equals() method.  Two publishers are equal if their name AND city are the same */

   public boolean equals( )
   {

   }
   
   public static void main( String[] args )
   {
      Publisher p1 = new Publisher("McGraw-Hill", "New York City", "Eductional");
      Publisher p2 = new Publisher("Penguin", "Boston", "Fiction");
      Publisher p3 = new Publisher("Wiley", "New York City", "Educational");
      Publisher p4 = new Publisher("Penguin", "Boston", "Classics");
      
      System.out.println( p1.equals(p1) ); // true
      System.out.println( p1.equals(p4) ); // false
      System.out.println( p4.equals(p2) ); // true
      System.out.println( p3.equals(p1) ); // false  
   }
}