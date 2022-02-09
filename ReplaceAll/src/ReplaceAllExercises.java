public class ReplaceAllExercises
{
   public static void main(String [] args)
   {
      //Sample String
      String str2 = "aB cD3 @?e ";
      
      //test variable
      String tempString = "";

      //TO DO
      //0. display original string
      System.out.println("display original string: " + str2);
      
      //1. remove all lower case letters
      tempString = str2.replaceAll("[a-z]","");
      System.out.println("remove all lower case letters: " + tempString);
      
      //2. remove all characters except lower case letters
      tempString = str2.replaceAll("[^(a-z)]","");

      System.out.println("remove all characters except lower case letters: " + tempString);
           
      //3. remove all upper case letters
      tempString = str2.replaceAll("[A-Z]","");

      System.out.println("remove all upper case letters: " + tempString);
      
      //4. remove all characters except upper case letters
      tempString = str2.replaceAll("[^(A-Z)]","");
      System.out.println("remove all characters except upper case letters: " + tempString);

      //5. remove all digits
      tempString = str2.replaceAll("[0-9]","");
      System.out.println("remove all digits: " + tempString);
      
      //6. remove all characters except digits
      tempString = str2.replaceAll("[^(0-9)]","");
      System.out.println("remove all characters except digits: " + tempString);

      //7. remove all spaces
      tempString = str2.replaceAll("[ ]","");
      System.out.println("remove all spaces: " + tempString);
   }
}