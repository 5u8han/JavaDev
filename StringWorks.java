public class StringWorks 
{
	private String str;
	
	public StringWorks(String a)
	{
		str = a; 
	}
	
	public double sumNumbersInString()
	{ 
      String a = "";
		double sum = 0;
		double temp = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
	      if(this.str.charAt(i) != '/')
			{
				a = a + "" + str.charAt(i);
			}
         
			else if(str.charAt(i) == '/')
			{
				temp = Double.valueOf(a);
				sum = sum + temp;
				a = "";
			}
		}
		return sum;
	}
	
	public static void main( String[] args )
	{
	   StringWorks s1 = new StringWorks("3.4/4.9/10.9/8.7/");
	   StringWorks s2 = new StringWorks("2.2/10.3/11.0/9.4/6.6/");
	   StringWorks s3 = new StringWorks("85.6/2.4/");
			
		System.out.println(s1.sumNumbersInString());
		System.out.println(s2.sumNumbersInString());
		System.out.println(s3.sumNumbersInString());
   }	
}
