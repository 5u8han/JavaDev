
public class Motorcycle {

	public Motorcycle() {
		
	}
	
	private String make="";
	private String model="";
	private double price=0.0;
	private int year=0;
	private int number=1;
	private boolean preOwned=false;
	
	public Motorcycle(String make, String model,int year, int number) {
		
		this.make=make;
		this.model=model;
		this.year=year;
		this.number=number;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public int getNumber() {
		return number;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getPreOwned() {
		return preOwned;
	}

	public void setPreOwned(boolean preOwned) {
		this.preOwned = preOwned;
	}
	public boolean isEqual( Motorcycle m) {
		if (this.number==m.number) {
			return true;
		}
		
		else return false;
	}
	

}
