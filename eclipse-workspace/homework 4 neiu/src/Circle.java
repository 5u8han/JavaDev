import java.math.BigDecimal;

public class Circle
{
  



public BigDecimal findCircleArea( double r )
   {
	
	  BigDecimal area;
	  BigDecimal radius= new BigDecimal(r);
	  BigDecimal pi = new BigDecimal(Math.PI);
	  

	  BigDecimal Rsqrd = radius.pow(2);
	  area= pi.multiply(Rsqrd);
	  

	  return area;
	  
   }   
   
   
   public static void main( String[] args )
   {
      Circle circle1 = new Circle();
      double radius;
      BigDecimal result;
      String output;
      
      radius = 3.56;
      result = circle1.findCircleArea( radius );
      output = result.toString();
      System.out.println( "The area of a circle with r of " + radius + " is: " );
      System.out.println( output );
      
      System.out.println();
      
      radius = 1.5689;
      result = circle1.findCircleArea( radius );
      output = result.toString();
      System.out.println( "The area of a circle with r of " + radius + " is: " );
      System.out.println( output );        
   }  
}