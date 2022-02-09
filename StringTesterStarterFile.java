public class StringTesterStarterFile
{
   public static void main(String [] args)
   {
      String str = "73167176531330624919225119674426574742355349194934" +
                   "96983520312774506326239578318016984801869478851843" +
                   "85861560789112949495459501737958331952853208805511" +
                   "12540698747158523863050715693290963295227443043557" +
                   "71636269561882670428252483600823257530420752963450";
                   
     String testString = "173167176531317";
     String subStr = "17";
     
     //TEST 1
     int occurrences = substringCount(testString, subStr);
     
     System.out.println("The value " + subStr + " occurs " + occurrences + " times");
     System.out.println("The sum of the occurrences of " + subStr + " is: " + substringSum(testString, subStr));
   
     //TEST 2
     //occurrences = substringCount(str, subStr);
     
     //System.out.println("The value " + str + " occurs " + occurrences + " times");
     //System.out.println("The sum of the occurrences of " + str + " is: " + substringSum(str, subStr));
   

   }
   public static int substringCount(String s1, String s2)
   {
      //using the substring method 
      //substringCount( ) returns the number of times the 
      //string s2 occurs in s1
      //restrictions:
      //    you may use no more than a single loop
      //    you must use the substring( ) method
      
      int count = 0;
      
    
      
      return(count);
   }
   public static int substringSum(String s1, String s2)
   {
      //using the substring method 
      //substringCount( ) returns the sum of the 
      //occurrences of string s2 in s1
      //restrictions:
      //    you may use no more than a single loop
      //    you must use the substring( ) method
      
      int sum = 0;
      
    
      
      return(sum);
   }
}
