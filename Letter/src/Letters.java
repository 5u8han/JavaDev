/*
Subhan Noeman - 623424
Programming II
Professor K. Sotak
 */
public class Letters {
    private String motto;
    private int number;
    public Letters(int number, String text){
        this.number = number;
        this.motto=text;
    }
    public void printVowels() {
        boolean noVowels=true;
        for (int i = 0; i < motto.length(); i++) {
            if (motto.charAt(i) == 97 || motto.charAt(i) == 101 || motto.charAt(i) == 105 || motto.charAt(i) == 111
                    || motto.charAt(i) == 117) {
                System.out.print(motto.charAt(i) + " ");
                noVowels=false;
            }
        }
        System.out.println();
        if (noVowels = true)
              System.out.println("No vowels found.");
    }
@Override
    public boolean equals( Object obj){
        if (obj==null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Letters otherObject = (Letters) obj;
        if(this.motto.equals(otherObject.motto)){
            return true;
        }
        return false;
    }
}
