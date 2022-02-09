/*
 * CS207-1 Spring 2019 Homework 5
 * NEIU
 * This class is a test class for MyStrings.java
 */
public class TestMyStrings
{
   public static void main(String[] args)
   {
      MyStrings s1 = new MyStrings("Hello world, welcome to the Java world.");
      
      
      System.out.println(s1.makeSubstring(0));
      System.out.println(s1.makeSubstring(6));
      System.out.println(s1.makeSubstring(6, 14));
      System.out.println(s1.makeSubstring(13));
      System.out.println(s1.makeSubstring(0, 12));
      System.out.println();
      
      
   }
}   
