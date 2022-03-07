import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        System.out.println("welcome\n This program converts pennies into larger change ");

        int Change,RemainingChange, Quarter, Nickle, Dime, Penny;
        Scanner input = new Scanner(System.in);

        System.out.println("Please input a change amount in pennies: ");
        Change = input.nextInt();

        if (Change < 5){
            RemainingChange = Change;
        }
        Quarter = Change/25;
        RemainingChange = Change%25;
        Dime = RemainingChange/10;
        RemainingChange=RemainingChange%10;
        Nickle = RemainingChange/5;
        RemainingChange = RemainingChange%5;
        Penny = RemainingChange;

        if (Quarter==1) {
            System.out.println(Quarter + " quarter");
        }
        else if (Quarter >1){System.out.println(Quarter + " quarters");}

        if(Dime ==1){
            System.out.println(Dime + " dime");
        } else if (Dime >1){System.out.println(Dime + " dimes");}

        if(Nickle ==1){
            System.out.println(Nickle + " nickle");
        } else if (Nickle >1){System.out.println(Nickle + " nickles");}

        if(Penny ==1){
            System.out.println(Penny + " penny");
        } else if (Penny >1){System.out.println(Penny + " pennies");}

    }
}
