import java.util.Scanner;
public class exam3prob3 {
	public static void main(String args[]) {
		File file = new File("lines.txt");
		String line;
		String[] text;
		boolean correct = true;
		try (Scanner input = new Scanner(file)) {
			int count = 0;
			
			while(input.hasNext()) {
				count++;
				int n = input.nextInt();
				line = input.nextLine();
				text[] = line.split(" ");
				int words = text.length;
				
				if(n != count) {
					line = line.substring(" ");
					correct = false;
					line = count = + " " + words;
					
				}
				
			}
		
		}
		
	}

}
