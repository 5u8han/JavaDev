import java.util.Scanner;

public class ShiftCrypt {
    public static void main(String[] args) {
        System.out.println("Are you encrypting or Decrypting? ");
        Scanner input = new Scanner((System.in));
        String shit = input.next();
        String text = new String(" ");
        int offset = 0;
        switch (shit) {

            case "e":
                System.out.println("fuck");
                System.out.println("Please enter the text that you would like to crypt: ");
                text = input.next();
                System.out.println("Enter the offset from 1 - 25: ");
                offset = input.nextInt();
                Encrypt(text, offset);

                break;

            case "d":
                System.out.println("fuck");
                System.out.println("Please enter the text that you would like to Decrypt: ");
                text = input.next();
                Decrypt decrypt = new Decrypt(text, offset);
                break;

        }


    }


    public static String Encrypt(String letters, int offset) {
        String newLetters = " ";

        for (int i = 0; i < letters.length(); i++) {


            // newLetters.charAt(i)= (char) (letters.charAt(i)+offset);

        }
        return "letters";

    }
}
