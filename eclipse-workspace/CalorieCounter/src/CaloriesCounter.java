/*Subhan Noeman ID: 623424
 * Professor Kenneth Sotak
 * CS 207 
 */ 

import java.util.Scanner;
public class CaloriesCounter {
public static void main (String [] args) {
	
	Scanner inputText = new Scanner ( System.in);
	int numberoffooditems, averagecalories=0,highestcalories=0 ,lowestcalories=0, smallestIndex=0,largestIndex=0,totalcalories = 0;
	String Food;
	
	System.out.println("Enter Number of Food Items: ");
	numberoffooditems= inputText.nextInt();
	String foodItem [] = new String [numberoffooditems];
	
	for(int i = 0; i<numberoffooditems; i++) {
		System.out.println("Enter name of food item: ");				// i store name of foods in a string array
		Food = inputText.next();
		foodItem [i] = Food;

		}
	
	int[] caloriecount = new int [foodItem.length];

	
	for(int i = 0; i<=foodItem.length-1; i++) { 							// remember to -1 from foodItem.length if necessary
		System.out.println("Enter Amount of Calories for " + foodItem[i]);
		caloriecount [i]= inputText.nextInt(); 
		totalcalories += caloriecount[i];
		
	}
	System.out.println("list of food items with calorie amount is ");		// here i print list of food items with calorie amount
	for(int i = 0; i<numberoffooditems; i++) {			
	System.out.println(foodItem[i]+" with "+caloriecount[i]+ " calories");

	}
	
	
	
	for(int i=0; i<foodItem.length-1;i++) {
		if(caloriecount[i]>highestcalories) {						//this is where i calculate the highest calorie count
			highestcalories=caloriecount[i];
			largestIndex=i;
		}
	}
	System.out.println("the food with the highest calories is "+foodItem[largestIndex] +" With the calorie amount of "+highestcalories);

	
	
	
	
	//This is where lowest Calorie Count is calculated
	
	for(int i = 0; i < foodItem.length; i++)
    {
       if(caloriecount[i] <highestcalories) {
    	   lowestcalories=caloriecount[i];
    	   smallestIndex=i;
       }
    }
	System.out.println("the food with the lowest calories is "+foodItem[smallestIndex] +" With the calorie amount of "+lowestcalories);
	averagecalories = totalcalories/foodItem.length;
	System.out.println("Total number of Calories are: " + totalcalories);
	System.out.println("Average number of Calories are: " + averagecalories);
	System.out.println("Item(s) exceeding average calorie amount are: ");

	for(int i = 0;i<foodItem.length;i++) {
		if(caloriecount[i]>averagecalories) {
			System.out.println(foodItem[i]+" With Calorie Amount of: "+ caloriecount[i]);
		}
	}
		
		System.out.println("Item(s) below average calorie amount are: ");
		for(int i = 0;i<foodItem.length;i++) {
			if(caloriecount[i]<averagecalories) {
				System.out.println(foodItem[i]+" With Calorie Amount of: "+ caloriecount[i]);
			}
	}
		
		System.out.println("Items that meet the average calorie requirement are: ");
		for(int i = 0; i <foodItem.length;i++) {
			if(caloriecount[i]==averagecalories) {
				System.out.println(foodItem[i]+" with "+caloriecount[i]+ " calories");
			}
			else
				System.out.println(" ");
		}
	

	
	
	
  }		// end Main Method
}    	// End Class   