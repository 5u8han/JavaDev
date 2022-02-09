/**
 * 
 */

/**
 * @author subhan
 *
 */
public class Point {
	private int x, y;
	
	
	public Point() {
		// TODO Auto-generated constructor stub
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
		public String toString() {
			String output = "";
			
			output += "(";
			output += getX();
			output += ", ";
			output += getY();
			output += ")";
			
			return output;
		
		}
	
	public double distance(Point that) {
		
double distance = 0.0;
		
		double a = Math.pow((that.getX() - getX()), 2);
		double b = Math.pow((that.getY() - getY()), 2);
		
		distance = Math.sqrt(a + b);
		
		return distance;
		
		
		
		
	}
}
