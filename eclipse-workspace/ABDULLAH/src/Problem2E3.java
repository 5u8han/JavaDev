public class Problem2E3
{
   public static void main(String[] args)
   {
      int[] a = {6,3,7,5,8};
      int[] b = {4,9,9,9,9,6};
      int[] c = {8,7,4,1,7,7,7};
      int[] d = {1,1,1,1};
      
     findMissingNumbers(a);
     findMissingNumbers(b);
     findMissingNumbers(c);
     findMissingNumbers(d);
   }
   public static void findMissingNumbers(int[] x)
   {
      
      for(int i = 0; i <10; i++)
      {
         int count = 0; 
         
         for(int j = 0; j <x.length; j++)
         {
            if(i+1== x[j])
            {
               count++;
            }   
         }
         if(count == 0)
            System.out.print((i+1)+" ");
      }
      System.out.println();
   }
}