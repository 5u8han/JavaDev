public class Problem1E3
{
   public static void main(String[] args)
   {
      int[][] x = {
    		  		{-2,10,13,72,117},
    		  		{90,47,39,201,-23},
    		  		{0,19,0,0,1}
    		  		};
      int[][] y = {	
    		  		{2,10,13,72,117},
    		  		{90,47,39,201,23},
    		  		{61,19,37,54,3},
    		  		{61,19,37,54,3}
    		  		};
      
      
      System.out.println(rowWithSmallestSum(x));
      
      System.out.println(rowWithSmallestSum(y));
   }
   public static int [] rowWithSmallestSum(int[][] x)
   {
      int min = 0, i , j;
      
      int [][] colSum= new int[x[0].length];
      
      for(i = 0; i < x.length; i++)
      {
         int sum = 0; 
         for( j = 0; j < x[0].length; j++)
         {
            sum += x[i][j];
            colSum[j] += x[i][j];
            
         }
       
      }
      return sum; 
   }
}