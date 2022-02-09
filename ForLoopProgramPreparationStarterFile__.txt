public class looptracin2
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
      int count=0;
      
      int i = 0;
      int prod = 1;
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
      for ( i = 0;i < b;i++)
      { 
      prod = prod * a;
      }
      System.out.println("the value of "+a+" to the power of "+b+" is : " +prod);
      prod=1;
      for ( i = 0;i < d;i++)
      { 
      prod = prod * c;
      }
      System.out.println("the value of "+c+" to the power of "+d+" is : " +prod);
      /*
         PROBLEM 2
         Using a 'for' loop, write code to generate the product of the numbers in the range of 'a' to 'c', inclusive.
         FOR STUDY
         Rewrite the code to generate the product of the numbers in the range of 'b' to 'c', inclusive.
      */
      prod=1;
      for (i=a;i <=c;i++)
      {
      prod = prod*i;
      }
      System.out.println("the product of "+a+" to "+c+" is : " +prod);
      
      
      prod=1;
      for (i=b;i <=c;i++)
      {
      prod = prod *i;
      }
      System.out.println("the product of "+b+" to "+c+" is : " +prod);
      

      /*
         PROBLEM 3
         Using a 'for' loop, write code to identify if the value in 'e' is a prime number.
         FOR STUDY
         Rewrite the code to identify if the value in 'f' is a prime number.
         Your code must use the variable isPrime, declared above, to arrive at your solution.
         
      */
            for(i=2;i<e;i++) {
            	if(e%i==0) {
            		System.out.println(e+" is Not a Prime Number");
            	}
            	
            }

      /*
      When one number divides another without leaving a remainder the first number is called a factor of the second. 
      A number n is said to be perfect if the sum of the factors which are less than n are equal to n. 
      For example, 28 is a perfect number because the sum of its factors which are less 
      than 28 (1, 2, 4, 7, and 14) equals 28.
       
      Using a 'for' loop, write code to identify if the value in 'g' is perfect.
      FOR STUDY
      Using a 'for' loop, write code to identify if the value in 'h' is perfect.
      Using a 'for' loop, write code to identify if the value in 'z' is perfect.
       
      */
      
       for(i=1;i<g;i++) {
    	   if(g%i==0) {
    		   count= count+i;
    	   }
       }
       
       if (g==count) {
    	   System.out.println(" "+g+" is a perfect number");
       }     
       else {
    	   System.out.println(g+ " is not a perfect number");
       }
     
       
       
       
       count=0;
       
       
       for(i=1;i<h;i++) {
    	   if(h%i==0) {
    		   count=count+i;
    	   }
       }
       if (h==count) {
    	   System.out.println(h+" is a perfect number");
       }
       else {
    	   System.out.println(h+" is not a perfect number");
       }

       
       
       
       
       count=0;
       for(i=1;i<z;i++) {
    	   if(z%i==0) {
    		   count=count+i;
    	   }
       }
       if (z==count) {
    	   System.out.println(z+" is a perfect number");
       }
       else {
    	   System.out.println(z+" is not a perfect number");
       }

       
       
       
       
       
       
       
       
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