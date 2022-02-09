
public class COLSUM {

	public static void main(String[] args) {
		int sum=0;
		int largest=0;
		int index=0;
		int [][] arr = {
				
				{5,10,1,5,0,0},
				{1,2,0,01,15},
				{8,7,0,0,0,0},
				{6,1,2,0,12,1}
		};
		
		for (int row =0; row<arr.length;row++) {
			for (int col=0;col<arr.length;col++) {
				
			
			System.out.print(arr[row][col]+" ");
			sum+= arr[row][col];
		}
			System.out.println();
			System.out.println("sum = "+ sum);
			if(sum>largest) {
				largest =sum;
				index = row;
			}
			sum=0;
		}
		System.out.println(largest+" this is the largest sum");
		System.out.println(index+" this is the inndex of the largest sum");
		
		
		System.out.println();
	}
}
