/**
 * @author subhan
 *
 */
public class Food {

    private String foodItem;
    private int numCalories;

    public Food() {
        foodItem = "";
        numCalories = 0;

    }

    public Food(String tempName, int tempCalories) {
    	 this.foodItem = tempName;
         this.numCalories = tempCalories;
         }

	@Override

    public String toString() {
        String str = "Food Item: " + this.foodItem + "\nCalories " + this.numCalories;
        return str;
    }
}
