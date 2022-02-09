import java.util.*;
public class DeepDish extends Pizza {
	
	public DeepDish(String size, String shape) {
		super(size, shape);
	}
	
	private String shape;
	private String size;
	private String[] toppings;
	Scanner input= new Scanner(System.in);
	

	
	public void chooseToppings() {
		int tops = 0;
		System.out.println("How many Toppings?  ");
		tops = input.nextInt();
		String[] toppings = new String [tops];
		
		for ( int i =0; i<toppings.length;i++) {
			System.out.println("Enter Topping: ");
			toppings[i]=input.next();
		}
		
	}
	public double Price() {
		double totalPrice=0.0;
		double smallPrice= 7.00;
		double largePrice = 10.00;
		if(this.getSize()=="Small") {
			totalPrice+=smallPrice+ toppings.length*(0.75);
		}
		else if (this.getSize()=="Large") {
			totalPrice+=largePrice + toppings.length;
		}
		return totalPrice;
		
	
	}
	
	
	@Override
public String toString() {
		
		String s = super.getShape() + " pizza " + " ";
		
		return s;
	}
	
}
