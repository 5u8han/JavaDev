
public class MathFunctions
{
   public BigInteger factorial( int n )
   {
      // Implement this method

   }

   public static void main( String[] args )
   {
      MathFunctions f = new MathFunctions();
      
      BigInteger result;
      int n;
      
      n = 45;
      result = f.factorial( n );
      System.out.println( n + "! is: " );
      System.out.println( result.toString() );
      
      System.out.println();
      
      n = 61;
      result = f.factorial( n );
      System.out.println( n + "! is: " );
      System.out.println( result.toString() );      
   }
}