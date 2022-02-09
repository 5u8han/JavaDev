import java.math.BigInteger;

public class MathFunctions
{
   public BigInteger factorial( int n ) {
// Below both mean the same thing
   BigInteger num = new BigInteger(n + "");
   
   for (int x = n; x > 1; x--) {
	   
	   num = num.multiply(new BigInteger(((Integer) (x - 1)).toString()));
	   num = num.multiply(new BigInteger((x - 1) + ""));
   }
   return num;
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
