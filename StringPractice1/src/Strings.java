public class Strings
{
    public static void main(String [] args)
    {
        String str1 = "12345";
        String str2 = "12345";

        String str3 = new String("12345");

        //EXERCISE 1: test the equality of each pair of strings in the following if-else block
        if(str1 == str2)
            System.out.println("They are equal");
        else
            System.out.println("They are not equal");

        //EXERCISE 2: test the equality of each pair of strings in the following if-else block using
        if(str1.equals(str2))
            System.out.println("They are equal");
        else
            System.out.println("They are not equal");


        //EXERCISE 3: display the characters in str1 in order of first to last, each on a separate line

        for( int i = 0 ; i < str1.length(); i++){
            System.out.println(str1.charAt(i));
        }




        //EXERCISE 4: display the characters in str1 in order of last to first, each on a separate line

        for( int i = str1.length() -1 ; i >=0 ; i--){
            System.out.println(str1.charAt(i));
        }




        //EXERCISE 5: declare an array of strings named "names" that stores the following data:
        //    mary  john  george   jorge    Martha


        String [] names = new String[4];



        //EXERCISE 6: display the string array "names" in order of first to last





        //EXERCISE 7: display the string array "names" in order of last to first





        //EXERCISE 8: find the sum of each digit in str1 above by
        //       extracting each character using the charAt( ) method, then
        //       adding the numeric value of the string representation using the
        //       valueOf( ) method.
        //       note: the answer is 15  (do you remember n(n + 1)/2  ?)






    }
}