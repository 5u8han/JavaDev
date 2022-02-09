
public class mostfrequentvalue {

	public static void main(String[] args) {
		int sum=0,largestSum=0, count=0, largestRowSum=0;
		int [][] arr = {
				
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
		};
		
		for (int row =0; row<arr.length;row++) {
			for (int col=0;col<arr.length;col++) {
				
			
			System.out.print(arr[row][col]+" ");
			sum+= arr[row][col];
			}
			
			System.out.println();

		}
		System.out.println(sum);
		
		
		
		
		
	}
}
