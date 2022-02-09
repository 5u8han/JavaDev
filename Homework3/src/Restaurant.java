 class Restaurant{
	 private String name;
	 private int seats;
	 private int rating;
	 public static int numLocations;
	 public Restaurant(String n, int s, int r)  { 
		 this.name = n; 
		 this.seats = s;  
		 this.rating = r;  
		 numLocations++;  
		 
	 }  
	 
	 public String getName()  { 
		 return this.name;
		 
	 }  
	 public int getSeats()  { 
		 return this.seats; 
		 
		 } 
	 
	 public int getRating()  {
		 return this.rating; 
		 }
	 
	 public String toString() {
		 
		 String s = ""; 
		 s += "Restaurant Name: " + this.name;
		 s += "\n";    s += "Seats: " + this.seats; 
		 s += "\n";    s += "Rating: " + this.rating + " stars";
		 s += "\n";    return s; 
	 
	 
	 }
}
  