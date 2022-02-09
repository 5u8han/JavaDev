
public class diagonalSum {

	public static void main(String[] args) {
int[][] arr1= { {1,2,3,4,5},
				{2,3,4,5,1},
				{3,4,5,1,2},
				{4,5,1,2,3},
				{5,1,2,3,4}     
				
				};
			int row=0,col=0,end=arr1.length-1,leftToRightSum=0,roghtTotLeftSum=0;
			for(row=0;row<arr1.length;row++) {
				for(col=0;col<arr1.length;col++) {
					System.out.print(arr1[row][col]+" ");
					leftToRightSum+=arr1[row][col];
					row++;
					
				}
				System.out.println();
			}
			
System.out.println("leftToRightSum = "+leftToRightSum);
			row=0;
			col=0;
			
			for(col=0;col<arr1.length;col++) {
				for(row=arr1.length-1;row>=0;row--) {
					
					System.out.print(arr1[col][row]+" ");
					
					
				}
				System.out.println();
			}
			
			
			
			System.out.println("rightTotLeftSum = "+roghtTotLeftSum);

			
			
	}
}