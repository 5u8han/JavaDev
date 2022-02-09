import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class BigNumFileIO {
    public static void main (String args[]){
        try {
            Scanner input = new Scanner( new File("bignumbers.txt"));
                while (input.hasNext()){
                    BigInteger num1 = new BigInteger(input.next());
                    BigInteger num2 = new BigInteger(input.next());
                    System.out.println(num1);
                    System.out.println(num2);
                    //sum

                    BigInteger sum = num1.add(num2);
                    System.out.println("The Sum is: "+sum);
                    //difference
                    BigInteger difference = num1.subtract(num2);
                    System.out.println("The difference of num1-num2 is: "+difference);
                    difference = num2.subtract(num1);
                    System.out.println("The difference of num2-num1 is: "+difference);

                    //product

                    BigInteger product = num1.multiply(num2);
                    System.out.println("The product is: "+product);

                    //remainder

                    /*BigInteger remainder = num1.mod(num2);
                    System.out.println("The remainder after dividing num1 by num2 is: "+remainder);
                    remainder = num2.mod(num1);
                    System.out.println("The remainder after dividing num2 by num1 is: "+remainder);

                    // quotient
                    BigInteger quotient = num1.divide(num2);
                    System.out.println("The quotient after dividing num1 by num2 is: "+quotient);
                    quotient = num2.divide(num1);
                    System.out.println("The remainder after dividing num2 by num1 is: "+quotient);
                    */

                    //CompareTo method

                    if (num1.compareTo(num1)==1){
                        System.out.println(num1+" is greater than "+num2);

                    }
                    else if (num1.compareTo(num2)==-1){
                        System.out.println(num1+" is less than "+num2);

                    }
                    else if (num1.compareTo(num2)==0){
                        System.out.println(num1+ " is equal to "+ num2);

                    }
                }

        } catch (FileNotFoundException e) {
            System.out.println("File not found"+e);
        }
    }
}
