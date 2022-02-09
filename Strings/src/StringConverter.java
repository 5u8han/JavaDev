
public class StringConverter {
	
	private char[][] ch;
	private String str;

	public StringConverter(char[][]ch) {
		this.ch = ch;
	}
	
	public StringConverter(String str) {
		this.str = str;
	}
	
		public String createString() {
		
			String convertedString = "";
		
				for (int row = 0; row < ch.length; row++) {
						for (int col = 0; col < ch[row].length; col++) {
							convertedString += this.ch[row][col];
							}
					}
				
			return convertedString;
	}
	
					public char[][] createCharArray() {
		
						char[][] charArr = new char[4][4];
			
							if (this.str.length() == 16) {
								for (int row = 0; row < charArr.length; row++) {
									for (int col = 0; col < charArr[row].length; col++) {
										charArr[row][col] = this.str.charAt( (row * 4) + col );
									}
								}
							}
		
							else {
								for (int row = 0; row < charArr.length; row++) {
									for (int col = 0; col < charArr.length; col++) {
										charArr[row][col] = '%';
									}
								}
							}
		
							return charArr;
					}
}
