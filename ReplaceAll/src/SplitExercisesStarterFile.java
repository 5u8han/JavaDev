public class SplitExercisesStarterFile
{
    //all problems in this section are to be solved using the split() method
    public static void main(String [] args)
    {
        String s1 = "I am enough of an artist to draw freely upon my imagination";
        String s2 = "Imagination is more important than knowledge";
        String s3 = "Knowledge is limited";
        String s4 = "Imagination encircles the world";
        String s5 = "Albert Einstein";

        System.out.println("There is/are " + wordCount(s1) + " word/words in " + s1);
        System.out.println("The longest word in " + s1 + " is " + longestWord(s1));
        System.out.println("Here are the words in " + s1 + " in reverse order\n" + reverseString(s1));
        //displayStringLineByLine(s1);
    }
    public static int wordCount(String s)
    {
        //method receives a String s
        //the method is return the number of words in String s;
        String [] tempArray = s.split(" ");

        return(tempArray.length);

    }
    public static String longestWord(String s)
    {
        int  largest =0, index=0;

        String [] tempArray = s.split(" ");
        largest = tempArray[0].length();
        for (int i=0; i<tempArray.length;i++){
            if (tempArray[i].length()>largest){
                largest = tempArray[i].length();
                index=i;
            }

        }

        return (tempArray[index]);
    }
    public static String reverseString(String s)
    {
        //method receives a String s
        //the method is to return a new String that
        //    is made up of the words of the original String
        //    placed in the reverse order of the original String
        String [] tempArray = s.split(" ");
        for (String str :tempArray){
            System.out.print(str+" ");
        }


        return("");

    }
    public static void displayStringLineByLine(String [] sArray)
    {
        //method receives an array of Strings
        //method displays the array of Strings,
        //    each on a separate line
        for (String str :sArray){
            System.out.println(str+" ");

        }

    }
    public static void displayStringOnOneLine(String [] sArray)
    {
        //method receives an array of Strings
        //method displays the array of Strings,
        //    all on the same line
        //note: spaces are to be added after each word, except the last
        for (String str :sArray){
            System.out.print(str+" ");
        }
            return;
    }

}
