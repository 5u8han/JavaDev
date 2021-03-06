public class ForLoopProgramPreparationStarterFile
{
   public static void main(String [] args)
   {
      int a = 2;
      int b = 5;
      int c = 10;
      int d = 4;
      int e = 121;
      int f = 13;
      int g = 12;
      int h = 6;
      int z = 20;
      
      int i = 0;
      int prod = 0;
      int sum = 0;
      boolean isPrime = false;
      
      //For the problems below, use the above variables when called for in the programming problem.
      //    You are free to add additional variables as needed to arrive at the appropriate solution.
   
      /*
         PROBLEM 1
         Using a 'for' loop, write code to generate the value of 'a' to the power of 'b'.
         FOR STUDY
         Rewrite the code to generate the value of 'c' to the power of 'd'.
      */
      
      //prod = 1;  could be done here or like you see in the loop
      
      for(i = 1, prod = 1; i <= b; i++)
      {
         prod = prod * a;
      }
 
      System.out.println(a + " to the power of " + b + " is: " + prod);
      /*
         PROBLEM 2
         Using a 'for' loop, write code to generate the product of the numbers in the range of 'a' to 'c', inclusive.
         FOR STUDY
         Rewrite the code to generate the product of the numbers in the range of 'b' to 'c', inclusive.
      */
      
      
      /*
         PROBLEM 3
         Using a 'for' loop, write code to identify if the value in 'e' is a prime number.
         FOR STUDY
         Rewrite the code to identify if the value in 'f' is a prime number.
         Your code must use the variable isPrime, declared above, to arrive at your solution.
      */
               for (i=1;i<=e;i++) {
            	   if(i%2==0) {
            		   System.out.println("even");
            	   }else System.out.println("odd");
               }
      /*
         PROBLEM 4
         When one number divides another without leaving a remainder the first number is called a factor of the second. 
         A number n is said to be perfect if the sum of the factors which are less than n are equal to n. 
         For example, 28 is a perfect number because the sum of its factors which are less 
         than 28 (1, 2, 4, 7, and 14) equals 28.
          
         Using a 'for' loop, write code to identify if the value in 'g' is perfect.
         FOR STUDY
         Using a 'for' loop, write code to identify if the value in 'h' is perfect.
         Using a 'for' loop, write code to identify if the value in 'z' is perfect.
       
      */
      
       
   }
}
/*PROGRAM OUTPUT

   2 to the power of 5 is: 32
   10 to the power of 4 is: 10000
   the product of 2 to 10 is: 3628800
   the product of 5 to 10 is: 151200
   The value 121 is not prime
   The value 13 is prime
   12 is not perfect
   6 is perfect
   20 is not perfect

*/