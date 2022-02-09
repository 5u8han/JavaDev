/*
Subhan Noeman - 623424
Programming II
Professor K. Sotak
 */
public class Problem1 {
    public static void main(String[] args){

        Letters let1 = new Letters(3, "enchantment");
        let1.printVowels();
        Letters let2 = new Letters(5, "try");
        try{
            let2.printVowels();
        }
        catch(IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        Letters let3 = new Letters(11, "enchantment");
        System.out.println(let1.equals(let2));
        System.out.println(let1.equals(let3));
    }
}
