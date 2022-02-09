
public class problem40 {

	public static void main(String[] args) {
		int [] arr = {31,23,11,55,12};
		int n =12;
		int bigger = elementsBiggerThan (arr,n);
		System.out.println(bigger);
	}
		public static int elementsBiggerThan(int [ ] a, int x) {
			int i=0;
			int count=0;
			
			for(i=0;i<a.length;i++) {
				if(a[i]>x) {
					count++;
				}
			}
			
			return count;
			
		}
	
	
	
}
