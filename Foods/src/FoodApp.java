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
        Food f3 = new Food("Apple", 50);
        System.out.println(f3);

        int x = 9; // corresponds to set method. this is set method
        System.out.println(x); // this uses the get method to print
        int y = x;
        System.out.println("\nObject f2 data is: \n"+f2);
        f2.setFoodItem("kumkuat");
        System.out.println("\nF2 is a "+f2.getFoodItem());

        f2.setNumCalories(20);
        System.out.println("\nF2 has "+f2.getNumCalories()+" calories");


            System.out.println("Food with fewer calories is: ");
        if (f2.getNumCalories()<f3.getNumCalories()){
            System.out.println(f2.getFoodItem());
        }
        else System.out.println(f3.getFoodItem());


    }

}
