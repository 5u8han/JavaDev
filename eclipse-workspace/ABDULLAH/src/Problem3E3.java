public class Problem3E3
{
   public static void main(String[] args)
   {
      int[] x = {75,89,45,50,1,30,49};
      
      int[] y = {81,3,27,9,1,24};
      
      int[] z = {88,5,44,19,44,91};
      
      int[] a = {12,7,4,1,5};
      
      System.out.println(twoSumToFirst(x));
      System.out.println(twoSumToFirst(y));
      System.out.println(twoSumToFirst(z));
      System.out.println(twoSumToFirst(a));
   }
   public static boolean twoSumToFirst(int[] x)
   {
      for(int i = 1; i < x.length; i++)
      {
         for(int j = i+1; j < x.length; j++)
         {
            int sum = 0; 
            
            if(x[i] != x[j])
               sum = x[i] + x[j]; 
            
            if(sum == x[0])
               return true; 
         }
      }
      return false; 
   }
}