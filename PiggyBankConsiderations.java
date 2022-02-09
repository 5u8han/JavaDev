public class PiggyBankConsiderations
{
   public static void main(String [] args)
   {
      double totalAmount = 16.72;
   
      int tempAmount = 0;
   
      System.out.println("totalAmount = " + totalAmount);
      System.out.println("tempAmount = " + tempAmount);
      
      System.out.println("totalAmount = " + (totalAmount * 100));
      
      tempAmount = (int)(totalAmount * 100); //multiply then cast double to an int
      System.out.println("totalAmount = " + totalAmount);
      System.out.println("tempAmount = " + tempAmount);
      
   }
}
/*
      // the line below will likely generate an error message 
      //tempAmount = totalAmount * 100; 
      
      //ERROR MESSAGE: incompatible types possible lossy conversion from double to int
*/