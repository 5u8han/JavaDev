/* 
 * This class will serve as a software representation of a book for Fast Fiction Books.
 * Think about the ways in which it is an abstraction for a book in the real world.
 */
public class Book
{

   // Class variables have class scope, class variables have default values
   private String title;
   public double price;
   public int quantity;
   public String author;
   public String genre = "Science fiction";
   
   // Class default constructor 
   public Book( String title )
   {
      this.title = title;
   }
   
   // Book behaviors
   public void setTitle( String t )
   {
      title = t;
   }
   
   public void printTitle()
   {
      System.out.println( "Title: " + title );
   }
   
   public void setGenre( String g )
   {
      genre = g;
   }
   
   public void printGenre()
   {
      System.out.println( "Genre: " + genre );
   }
   

   
}
