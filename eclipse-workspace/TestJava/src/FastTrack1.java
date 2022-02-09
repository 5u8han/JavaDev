import java.util.*;

public class FastTrack1 {
	public static void main(String args[]) {
		int total=0;
		int i=10;
		for (i=0; i<1000;i++) {
			if(i%3==0) {
				total = total + i;
			}
			if (i%5==0) {
				total = total +i;
			}
		}
		System.out.println(total);

	}

}
