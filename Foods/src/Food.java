/**
 * @author subhan
 *
 */
public class Food {

    private String foodItem;
    private int numCalories;

    //this constructor takes in no values and applies the default values to the variables
    public Food() {
        foodItem = "";
        numCalories = 0;

    }

    public Food(String tempName, int tempCalories) {
        this.foodItem = tempName;
        this.numCalories = tempCalories;
    }

    //here we implement setters and getters


    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public int getNumCalories() {
        return numCalories;
    }

    public void setNumCalories(int numCalories) {
        this.numCalories = numCalories;
    }

    @Override

    public String toString() {
        String str = "Food Item: " + this.foodItem + "\nCalories " + this.numCalories;
        return str;
    }
}
