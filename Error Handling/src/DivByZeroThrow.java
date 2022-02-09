public class DivByZeroThrow
{
	public static void main(String [] args)
	{
		int result = divByZero(24, 3);
			
		System.out.println("result = " + result);
		
		result = divByZero(24, 0);
		
		System.out.println("result = " + result);
      
      result = divByZero(24, 6);
		
		System.out.println("result = " + result);
	}
	public static int divByZero(int num, int denom)
	{
		return(0);
	}
}