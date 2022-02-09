
import java.util.Scanner;

public class RegEx1
{
    public static void main (String []args)
    {
        String ssn1 = "123-45-6789";
        String ssn2 = "123-45-6789";
        System.out.println("Enter anything: ");
        Scanner kbd = new Scanner(System.in);
        String input = kbd.next();
        String tempString = input.replaceAll("[0-9]","");
        if (tempString.length()>0){
            System.out.println("String is alphaSpecial ");
    }
        else System.out.println("String is numeric");

    }
}
