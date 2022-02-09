/*
Subhan Noeman - 623424
Programming II
Professor K. Sotak
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String text = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text that you would like to palindrome");
        text = input.next();
        System.out.println("Palindrome text as follows: ");
        String palindromeText= text + makepalindromeText(text);
        System.out.println(palindromeText);
    }

        public static String makepalindromeText(String text) {
            String reverse="";
            for (int i = text.length() - 1; i >= 0; i--) {
                reverse = reverse +text.charAt(i);
            }
            return reverse;
        }
}

