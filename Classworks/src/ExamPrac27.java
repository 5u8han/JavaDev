
public class ExamPrac27 {

	public static void main(String[] args) {
		
		int middleValue = middlevalue(4,9,7);
	
		System.out.println("middlevalue(4,9,7) would return " + middleValue);
		
		int middleValue1 = middlevalue(40, 70, 90);
		
		System.out.println("middlevalue(40,70,90) would return " + middleValue1);
		
		int middleValue2 = middlevalue(700 , 900 , 400);
		
		System.out.println("middlevalue(700,900,400) would return " + middleValue2);
		int middleValue3 = middlevalue(8,2,5);
		
		System.out.println("middlevalue(8,2,5) would return " + middleValue3);
	
	}

		public static int middlevalue( int a, int b , int c) {
		int max, middle = 0 ,min;
		
		if(a >= b && b >= c) {
			max=a;
			middle=b;
			min=c;
		}
		else if (a>c& c>b) {
			max=a;
			middle=c;
			min=b;
		}
		else if (b>a&a>c) {
			max=b;
			middle=a;
			min=c;
		}
		else if (b>c&c>a) {
			max=b;
			middle=c;
			min=a;
		} 
		else if (c>a&a>b) {
			max=c;
			middle=a;
			min=b;
		}
		else if (c>b&b>a) {
			max=c;
			middle=b;
			min=a;
		}
		
		return middle;
	}
}

	      
	      
	  