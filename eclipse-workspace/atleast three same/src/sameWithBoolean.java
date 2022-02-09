
public class sameWithBoolean {
	public static void main(String args[]) {
		boolean threeMatch = false;
		threeMatch = atLeastThreeMatch(5,3,5,5);
		System.out.println("the method returns " + threeMatch);
		
		threeMatch = atLeastThreeMatch( 7,3,7,9);
		System.out.println("this method returns " + threeMatch);
	}
			public static boolean atLeastThreeMatch(int a,int b,int c,int d) {
				if (a==b && a==c & a==d) { //all numbers same
					return(true);
					}
				
				else if (b==c && b==d) { //a is different
					return(true);
				}
				else if (a==c && a==d) {// b is different
					return(true);
				}
				else if (a==b && a==d) {// c is different
					return(true);
				
				}
				else if (a==b && a==c) { // d is different 
					return(true);
				}
				
				
				return(false);
			}
}
