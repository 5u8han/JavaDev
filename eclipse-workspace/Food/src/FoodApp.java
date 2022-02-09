import java.util.Scanner;
/**
 * @author subhan
 *
 */
public class FoodApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        Food f1 = new Food();
        Food f2 = new Food();
        Food f3 = new Food();
        Food f4 = new Food("Apple", 50);
        System.out.println(f4);
    }

}
