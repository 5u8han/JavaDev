/*
Subhan - 623424
Prof K. Sotak
Assignment #3 - Programming 2
 */
public class StringTesterStarterFile
{
    public static void main(String [] args)
    {

        //EXAMPLE 1
        String testString1 = "173167176531317";
        String subStr1 = "17";

        //EXAMPLE 2
        String testString2 = "I am not happy";
        String subStr2 = "not ";

        //EXAMPLE 3
        String testString3 = "I am not happy and not glad";
        String subStr3 = "not ";

        //EXAMPLE 4
        String testString4 = "neither this nor that works!";
        String subStr4 = "neither this nor ";

        System.out.println("The string " + testString1 + " without " + subStr1 + " is: " + removeSubstring(testString1, subStr1));
        System.out.println("The string " + testString2 + " without " + subStr2 + " is: " + removeSubstring(testString2, subStr2));
        System.out.println("The string " + testString3 + " without " + subStr3 + " is: " + removeSubstring(testString3, subStr3));
        System.out.println("The string " + testString4 + " without " + subStr4 + " is: " + removeSubstring(testString4, subStr4));


    }

    public static String removeSubstring(String s1, String s2)
    {
        //using the substring method
        //substringCount( ) returns the sum of the
        //occurrences of string s2 in s1
        //restrictions:
        //    you may use no more than a single loop
        //    you must use the substring( ) method



        //PLEASE COMPLETE THIS METHOD
        String tempString=s1;

        for (int i=0 ; i<tempString.length() -s2.length(); i++){
            if (tempString.substring(i,i+s2.length()).equals(s2)){
                tempString = tempString.substring(0,i) +tempString.substring(i+s2.length(), tempString.length());
                i--;
            }
        }






        return(tempString);
    }

}
