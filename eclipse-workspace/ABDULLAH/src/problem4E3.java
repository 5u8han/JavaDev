import java.util.Scanner; 

public class problem4E3
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a positive integer n: ");
      int x = input.nextInt();
      
      int[] result = new int[x];
      
      for(int i = 0; i < result.length; i++)
      {
         System.out.print("Enter integer "+(i+1)+": ");
         result[i] = input.nextInt();
      }
      for(int i = 0; i < result.length; i++)
      {
         if(result[i] < 0)
            System.out.print(result[i]+" ");
      }
   }   
}