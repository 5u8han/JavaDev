public class Decrypt {
    int differ =0;
    int offset =0;
    String text="";


    public Decrypt(String text, int offset){
        for (int i =0 ; i < text.length() ; i++){
            differ=text.charAt(i);
            System.out.print(differ+ " ");
            System.out.print((char)differ);
            if (differ>26){
                differ=0;
            }


        }

    }
}
