/*
Subhan Noeman - 623424
Programming II
Professor K. Sotak
 */

import java.util.Scanner;

public class LetterCount
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter text: ");
        String inputText = input.nextLine();
        System.out.println("The number of words entered, are: "+wordCount(inputText));

    }
    public static int wordCount(String s){
        String[] newWordCount = s.split( " ");
        return newWordCount.length;
    }
}
