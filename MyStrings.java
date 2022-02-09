public class MyStrings
{
   private String str;
   
   public MyStrings(String str){
      this.str = str;
   }
   
   	public void MyStrings(String str){
   		this.str = str;
   	}
   
   		public String makeSubstring(int x){
   			String a = str.substring(x);
   			return a;   
   		}

   				public String makeSubstring(int x, int y){
   					String b = str.substring(x, y);
   					return b;    
   				}
   
   							public int findIndexOf(int character){
   								int string = str.indexOf(character);
   								return string;
   							}
   
   public int findIndexOf(int character, int fromIndex){
      int string = str.indexOf(character, fromIndex);
      return string;
   }
   
   		public int findIndexOf(String str){
   			int string = this.str.indexOf(str);
   			return string;
   		}
   
   				public int findIndexOf(String str, int fromIndex){
   					int string = this.str.indexOf(str, fromIndex);
   					return string;
   				}
   
   
   
}