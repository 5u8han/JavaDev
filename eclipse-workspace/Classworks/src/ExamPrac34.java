import java.util.Scanner;

public class ExamPrac34 {

	public static void main(String[] args) {
		boolean rightTriangle = canFormRightTriangle(3,4,5);
		System.out.println("canFormRightTriangle(3,4,5) returns: "+rightTriangle);
		
		boolean rightTriangle1 = canFormRightTriangle(5,3,4);
		System.out.println("canFormRightTriangle(5,3,4) returns: "+rightTriangle1);
		boolean rightTriangle2 = canFormRightTriangle(6,10,8);
		System.out.println("canFormRightTriangle(6,10,8) returns: "+rightTriangle2);

		boolean rightTriangle3 = canFormRightTriangle(10,8,6);
		System.out.println("canFormRightTriangle(10,8,6) returns: "+rightTriangle3);

		boolean rightTriangle4 = canFormRightTriangle(12,5,13);
		System.out.println("canFormRightTriangle(12,5,13) returns: "+rightTriangle4);

		boolean rightTriangle5 = canFormRightTriangle(3, -4, 5);
		System.out.println("canFormRightTriangle(5,3,4) returns: "+rightTriangle5);

		
		boolean rightTriangle6 = canFormRightTriangle(-5, -4, -3);
		System.out.println("canFormRightTriangle(-5,-4,-3) returns: "+rightTriangle6);

		
		
		boolean rightTriangle7 = canFormRightTriangle(0,0,0);

		System.out.println("canFormRightTriangle(0,0,0)) returns: "+rightTriangle7);

		
		boolean rightTriangle8 = canFormRightTriangle(5,0,5);
		System.out.println("canFormRightTriangle(5,0,5)) returns: "+rightTriangle8);

		
		boolean rightTriangle9 = canFormRightTriangle(1,2,3);
		System.out.println("canFormRightTriangle(1,2,3) returns: "+rightTriangle9);

		
		
		
	}
	public static boolean canFormRightTriangle(int a, int b, int c) {
		
		if(a<=0 || b<=0 || c<=0) {
			return false;
		}
		
		if(a>b & a>c) {
			
			if(a*a == ((b*b) + (c*c))) {
				return (true);
			}
		}
		
		
		if(b>a & b>c) {
			
			if(b*b == (a*a + c*c)) {
				return (true);
			}
		}
		
		
		if(c>a & c>b) {
			if(c*c == (b*b + a*a)) {
				return (true);
			}
		}
		return false;
		
	}

}
