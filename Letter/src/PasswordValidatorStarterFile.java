/*
Subhan Noeman - 623424
Programming II
Professor K. Sotak
 */
public class PasswordValidatorStarterFile {
    public static void main (String[]args)
    {
        System.out.println("test valid: " + validator("aB2!$234"));
        System.out.println("test invalid length: " + validator("B2!$234"));
        System.out.println("test no lower-case alpha: " + validator("BB2!$234"));
        System.out.println("test no upper-case alpha: " + validator("aa2!$234"));
        System.out.println("test no digit: " + validator("aBB!$CCC"));
        System.out.println("test no !: " + validator("aB2$$234"));
        System.out.println("test no $: " + validator("aB2!!234"));
    }
    public static boolean validator(String psswd) {
        String temp = psswd;
        if(psswd.length()<7){
            return false;
        }
        if(psswd.replaceAll("[a-z]","").length() == temp.length()){
            return false;
        }
        if (psswd.replaceAll("[A-Z]","").length()==temp.length()){
            return false;
        }
        if (psswd.replaceAll("[0-9]","").length()==temp.length()){
            return false;
        }
        if (psswd.replaceAll("[//$]", "").length()==temp.length()){
            return false;
        }
        if (psswd.replaceAll("[//!]", "").length()==temp.length()){
            return false;
        }
        return true;
    }

}
