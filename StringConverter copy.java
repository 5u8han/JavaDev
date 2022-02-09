
public class StringConverter {
	
	private char[][] ch;
	private String str;

	public StringConverter(char[][] x) {
		// TODO Auto-generated constructor stub
		this.ch = x;
	}
	
	public StringConverter(String str) {
		// TODO Auto-generated constructor stub
		this.str = str;
	}
	
	public String createString() {
		
		String converted = "";
		
		for (int row = 0; row < ch.length; row++) {
			for (int col = 0; col < ch[row].length; col++) {
				converted += this.ch[row][col];
			}
		}
		return converted;
	}
	
	public char[][] createCharArray() {
		
		char[][] charArr = new char[4][4];
		
		// Check to see if array is equal to 4x4
		if (this.str.length() == 16) {
			// Fills the 4x4 array with 
			for (int row = 0; row < charArr.length; row++) {
				for (int col = 0; col < charArr[row].length; col++) {
					charArr[row][col] = this.str.charAt( (row * 4) + col );
				}
			}
		}
		else {
			// Fills the 4x4 array with '@'
			for (int row = 0; row < charArr.length; row++) {
				for (int col = 0; col < charArr.length; col++) {
					charArr[row][col] = '@';
				}
			}
		}
		
		return charArr;
	}
}
