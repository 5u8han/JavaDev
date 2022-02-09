import java.util.Scanner;

public class MaxValue2DArray {

	public static void main(String[] args) {
		int row=0,col=0,i=0,n=0,maxValue=0;
		double sum=0.0;
		double average=0.0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter n: ");
		n=input.nextInt();
		System.out.println("enter "+n+" amount of values");
		int [] arr = new int [n];

		for (i=0;i<n;i++) {
			arr[i]=input.nextInt();
			sum +=arr[i];
			
		}
		average = sum/n;
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+ average);
		System.out.print("Values less than average are : ");
		for (i=0;i<arr.length;i++) {
			if(arr[i]<average) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
