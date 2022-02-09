public class ReplaceAllSampleProgrammingProblemsStarterFile
{
    public static void main(String [] args)
    {
        //RESTRICTION 1: the solutions for the following problems may not use a loop
        //RESTRICTION 2: the solution for each problem may add/use no more than a single line of code;

        //sample data and temporary variables
        //Sample String
        String str1 = "aB cD3 @?e ";
        String str2 =  "1) I am enough of an artist to draw freely upon my imagination. ";

        //test variable
        String tempString = "";

        char c1 = 'a';
        char c2 = 'r';
        char c3 = 't';

        //Problem 1
        System.out.println("Display the number of vowels found in the following string:");
        System.out.println(str2);

        //tempString;
        System.out.println("There are " + tempString.length() + " vowels found.");
        System.out.println();

        //Problem 2
        System.out.println("Display the uppercase letters found in the following string:");
        System.out.println(str2);

        //tempString;
        System.out.println("The uppercase letters are " + tempString);
        System.out.println();

        //Problem 3
        System.out.println("Display all non-alpha characters found in the following string:");
        System.out.println(str2);

        //tempString;
        System.out.println("The non-alphas are: " + tempString);
        System.out.println();

        //Problem 4
        System.out.println("Display all special characters found in the following string:");
        System.out.println(str1);

        //tempString;
        System.out.println("The special (non-alpha, non-digit) characters are: " + tempString);
        System.out.println();
    }
}