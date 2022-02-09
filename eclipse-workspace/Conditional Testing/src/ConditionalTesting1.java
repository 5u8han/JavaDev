public class ConditionalTesting1
{
   public static void main(String [] args)
   {
      int a = 8;
      int b = 7;
      int c = -5;
      int d = 0;
      
      //is it even or odd
      //  if the number is even, display "even", otherwise display "odd"
      if(a % 2 == 0)
      {
         System.out.println("even");
      }
      else
      {
         System.out.println("odd");
      }
      
      //is the value positive or negative
      //if the number is positive, display the word "positive", otherwise
      //    display the word "negative"
      
      if(c > 0)
      {
         System.out.println("positive");
      }
      else
      {
         System.out.println("negative");
      }
      
      //display the absolute value of the number
      if(c > 0)
      {
         System.out.println(a);
      }
      else
      {
         System.out.println( -1 * c );
      }
      
      
      
      
      //is the value negative or non-negative
      //if the value is non-negative, display the message "non-negative"
      //    otherwise, display the message "negative"
      if(d < 0)
      {
         System.out.println("negative");
      }
      else
      {
         System.out.println("non-negative");
      }
      
      if(d >= 0)
      {
         System.out.println("non-negative");
      }
      else
      {
         System.out.println("negative");
      }
      
      //test for equality
      //if the first value equals the second value, display "equals"
      //    otherwise, display "not equal"
      
      if(a == b) //testing if two are equal to each other
      {
         System.out.println("equals");
      }
      else
      {
         System.out.println("not equal");
      }
      
      if(a != b) //test if two are not equal to each other
      {
         System.out.println("not equal");
      }
      else
      {
         System.out.println("equals");
      }
      
      System.out.println("Bye");
      
      //test if one value is larger than the other
      //    display the larger of the two values
      
      if(a > b)
      {
         System.out.println(a);
      }
      else
      {
         System.out.println(b);
      }
      
      //test if one value is smaller than the other
      if(a < b)
      {
         System.out.println(a);
      }
      else
      {
         System.out.println(b);
      }
      
      
      
      
   }
}