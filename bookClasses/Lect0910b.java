/**
 * Class for creating a template for a simple Java program
 * 
 * @author Pat Troy: troy AT uic DOT edu
 */

// Note the name of the class in the following line MUST 
// match the name of the file.  This is stored in a file
// named: Lect0910b.java 
public class Lect0910b 
{
  
  public static void main (String[] args) 
  {
    System.out.println("Begin Java Exection");
    System.out.println("");


    // put your Java Program here
    
    // step 1 - create my world
    World world1;
    world1 = new World ();
      
    /* step 2 - create my turtle */
    Turtle t1;
    t1 = new Turtle (world1);     
    
    // move the turtle around the world
    t1.forward();
    t1.turnLeft();
    t1.forward (200);
    
    // display my world
    world1.show();
    
    
    


    System.out.println("");
    System.out.println("End Java Exection");
  }
    
  
} // end of Template class