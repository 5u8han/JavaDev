
public class SHIT {

	public static void main(String[] args) {
		
		
		int [] a = {3,7,18,6,97};
		int i=0, sum=0,smallest=0, largest=0;
		
		
		for ( i=0; i< a.length; i++) { 
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		for ( i=0; i< a.length; i++) { 
			sum = sum + a[i];
			
		}
System.out.println(sum);

		for ( i=0; i< a.length; i++) { 
			if (a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		for ( i=0; i< a.length; i++) { 
			if (a[i] > largest) {
				largest = a[i];
			}
			System.out.println("Largest "+largest);
		}
		for (i=a.length-1;i>=0;i--) {
			if(a[i]<smallest) {
				smallest = a[i];
			}
			System.out.println(" Smallest: "+smallest);
		}
	
		smallest = getSmallest(a);
		System.out.println("smallest : "+ smallest);
		largest = getLargest(a);
		System.out.println("Largest: "+ largest);
		


	}
	
	
	
		public static int getSmallest(int [] arr ) {
			int smallest = 999999999;
			int i=0;
			for ( i=0; i< arr.length; i++) { 
				if (arr[i] < smallest) {
					smallest = arr[i];
				}
				
			}
			return smallest;
}
		public static int getLargest(int[] arr) {
			int largest=0;
			int i =0;
		
			for ( i=0; i< arr.length; i++) { 
				if (arr[i] > largest) {
					largest = arr[i];
				}
		}
			return largest;
}
}
