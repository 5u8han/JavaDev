
public class OdometerCounter {

	public static void main(String[] args) {

		int units=0, tens=0, hundreds=0,thousands=0,tenthousands=0,hundredthousands=0,count=0;
		for (hundredthousands=0;hundredthousands<=9;hundredthousands++) {
			for(tenthousands=0;tenthousands<=9;tenthousands++) {
				for(thousands=0;thousands<=9;thousands++) {
					for(hundreds=0;hundreds<=9;hundreds++) {
						for(tens=0;tens<=9;tens++) {
							for(units=0;units<=9;units++) {
							
								if(hundredthousands==1) {
								count++;
								}
								if (tenthousands==1) {
									count++;
								}
								if(thousands==1) {
								count++;
								}
								if(hundreds==1) {
								count++;
								}
								if(tens==1) {
								count++;
								
								}
								if(units==1) {
								count++;
								}
							}	
						}
					}
				}
			}
		}
		System.out.println("The number of times 1 aprears in an odometer is : "+count+" times ");
	}
}


//output
// The number of times 1 aprears in an odometer is : 600000 times 
