import java.util.*;
import java.io.*;
import java.math.*; //required for BigInteger and BigDecimal classes

public class BigIntegerBasics
{
   public static void main(String [] args)
   {
      /* the below attempts throw an error message: integer number too large: 
      int a = 321321321321; //too large to be a valid integer type
      int b = 987987987987; //too large to be a valid integer type 
      */
      
      //declaring objects of type BigInteger
      BigInteger biA = new BigInteger("321321321321");
      BigInteger biB = new BigInteger("987987987987");
      BigInteger biSum = BigInteger.ZERO; //three BigInteger constants are defined: ZERO, ONE, TEN
      
      BigInteger biC = BigInteger.valueOf(12); //initialization performed on int sized values
      BigInteger biD = BigInteger.valueOf(3);
      BigInteger biE = BigInteger.ZERO;
      
      //performing operations on BigInteger objects
      biE = biC.add(biD);
      System.out.println("Sum = " + biE);
      
      biE = biC.subtract(biD);
      System.out.println("Difference = " + biE);
      
      biE = biC.divide(biD);
      System.out.println("quotient = " + biE);
      
      biE = biC.multiply(biD);
      System.out.println("product = " + biE);
      
      //calling a method that returns a BigInteger
      System.out.println("****************************************");
      biE = biA.add(biB);
      System.out.println("Using the .add( ) method the sum stored in biE is: " + biE);
      biSum = sumBigInts("321321321321", "987987987987");
      System.out.println("The return value from the method is: " + biSum);
   }
   public static BigInteger sumBigInts(String a, String b)
   {
      BigInteger bi1 = new BigInteger(a);
      BigInteger bi2 = new BigInteger(b);
      BigInteger biResult = bi1.add(bi2);
      return biResult;
   }
}