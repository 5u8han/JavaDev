import java.util.Scanner;

public class ArrayObjectivesPracticeGroup2
{
	public static void main(String [ ] args)
	{
		Scanner kbd = new Scanner(System.in);
      
      //Note: the data in arrays arr, a and b are given here as sample arrays.
      //          the code you write for your solution must be written in such 
      //          a way that it can work with arrays of any size.
      int [] arr = {19, 28, 11, 49, 83};
      int [] a = {11, 19, 28, 49, 83 };
      int [] b = {83, 49, 28, 19, 11};
      int [] c = {5, 4, 3, 2, 1, 2, 3, 4, 5};
      int [] d = {5, 4, 3, 2, 1, 5, 4, 3, 2};
      int [] e = {5, 4, 3, 2, 1, 2, 3, 4, 5};
      int [] f = {5, 4, 3, 2, 1};
      int [] g = {1, 2, 3, 4, 5};
      int val_1 = 19;
      int val_2 = 94;
      
      int i = 0;
      boolean methodReturnValue = false;
      //Test 1: see if a value exists in an array
      
      //test 1 isPresent
      methodReturnValue = isPresent(a, val_1);
      System.out.println("test 1 returns: " + methodReturnValue);
      
      //test 2 isPresent
      methodReturnValue = isPresent(a, val_2);
      System.out.println("test 2 returns: " + methodReturnValue);
      
      //test 3 isSortedAscending
      methodReturnValue = isSortedAscending(arr);
      System.out.println("test 3 returns: " + methodReturnValue);
      
      //test 4 isSortedAscending
      methodReturnValue = isSortedAscending(a);
      System.out.println("test 4 returns: " + methodReturnValue);
      
      //test 5 isSortedDescending
      methodReturnValue = isSortedDescending(arr);
      System.out.println("test 5 returns: " + methodReturnValue);
      
      //test 6 isSortedDescending
      methodReturnValue = isSortedDescending(a);
      System.out.println("test 6 returns: " + methodReturnValue);
      
      //test 7 isEqual
      methodReturnValue = isEqual(a, b);
      System.out.println("test 7 returns: " + methodReturnValue);
      
      //test 8 isEqual
      methodReturnValue = isEqual(a, b);
      System.out.println("test 8 returns: " + methodReturnValue);
      
      //test 9 isReversed
      methodReturnValue = isReversed(a, b);
      System.out.println("test 9 returns: " + methodReturnValue);
      
      //test 10 isReversed
      methodReturnValue = isReversed(f, g);
      System.out.println("test 10 returns: " + methodReturnValue);
      
      //test 11 isPalindrome
      methodReturnValue = isPalindrome(d);
      System.out.println("test 11 returns: " + methodReturnValue);
      
      //test 12 isPalindrome
      methodReturnValue = isPalindrome(e);
      System.out.println("test 12 returns: " + methodReturnValue);
      
   }
   public static boolean isPresent(int [] m, int x)
   {
      //the method receives an integer array 'm' and an integer value 'x'
      //the method returns true if the value in 'x' appears in array 'm'
      //otherwise, the method returns false
      
      
      
      return(false);
   }
   public static boolean isSortedAscending(int [] m)
   {
      //the method receives an integer array 'm'
      //the method returns true if the values in array 'm' are
      //    in sorted order, from lowest to highest
      //otherwise, the method returns false
      
      
      
      return(false);
   }
   public static boolean isSortedDescending(int [] m)
   {
      //the method receives an integer array 'm'
      //the method returns true if the values in array 'm' are
      //    in sorted order, from highest to lowest
      //otherwise, the method returns false
      
      
      
      return(false);
   }
   public static boolean isEqual(int [] m, int [] n)
   {
      //the method receives an integer array 'm' and an integer array n
      //the method returns true if the values in array 'm' are identical to, and
      //    in the same order, as the values in array 'n'
      //otherwise, the method returns false
      
      
      
      return(false);
   }
   public static boolean isReversed(int [] m, int [] n)
   {
      //the method receives an integer array 'm' and an integer array n
      //the method returns true if the values in array 'm' are identical to those in
      //    array 'n', but appear in the reverse order of each other
      //otherwise, the method returns false
      
      
      
      return(false);
   }
   public static boolean isPalindrome(int [] m)
   {
      //the method receives an integer array 'm'
      //the method returns true if the values in array 'm'
      //     is the same if it is read from first to last or 
      //     last to first
      //otherwise, the method returns false
      
      
      
      return(false);
   }
   
}