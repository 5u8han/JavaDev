import java.util.Scanner;
public class FastFictionBooks{

   public static void main (String args[]) {
        
   System.out.println("Welcome to  programming II");
   
      book book1 = new book("new big d bob");
      book1.setTitle("Big D Bob");
      
      book1.printTitle();
      book book2 = new book(" new big black d bob");
      book2.setTitle("Big Black D Bob");
      book2.printTitle();
      book2.setGenre("Mystery");
      book2.printGenre();
   
      book1.title= "nigger";
      book1.printTitle();
      book1.price=9.11;
      book1.printPrice();
   
   
   }
}  

