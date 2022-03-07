import java.util.*;

public class HowManyEnteredBeforeBothSeen {

    public static void main(String[] args) {
        System.out.println("welcome\n This program checks to see when 2 integers were entered  ");

        Scanner input = new Scanner(System.in);
        boolean aFound = false;
        boolean bFound = false;
        boolean foundBoth = false;
        int a, b, count = 0;
        ArrayList<Integer> list = new ArrayList();
        System.out.println("Enter value a: ");
        a = input.nextInt();
        System.out.println("Enter value b: ");

        b = input.nextInt();

        System.out.println("Now keep entering numbers until program succeeds: ");
        while (aFound != true && bFound != true) {
            list.add(input.nextInt());
            System.out.println("Next: ");
            if (list.contains(a) && list.contains(b)) {
                aFound = true;
                bFound = true;

            }

            System.out.println("You had to enter " + list.size() + " values before both " + a + " and " + b + " were seen.");
        }
    }
}