public class TestRestaurant{
	public static void main(String[] args)  { 
		Restaurant r1;
		r1 = new Restaurant("Willow Inn", 45, 4); 
		System.out.println(r1.toString()); 
		Restaurant r2;
		r2 = new Restaurant("Omega", 84, 5);
		System.out.println(r2.toString());
		Restaurant r3;
		r3 = new Restaurant("McDonalds", 37, 3);
		System.out.println(r3.toString()); 
		String str;
		str = "Number of restaurants:" ;
		int num = Restaurant.numLocations;
		str = str + num;
		System.out.println(str);
		
		
		
		
		
		}
	}