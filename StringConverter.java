public class StringConverter
{
   private char[][] ch;
   private String str;
   
   public StringConverter(char[][] ch)
   {
      this.ch = ch;
   }
   
   public StringConverter(String a)
   {
      str = a;
   }
   
   public String createString()
   {
      String x = "";
      for(int i = 0; i < ch.length; i++)
      {
         for(int j = 0; j < ch[i].length;j++)
         {
            x = x + ch[i][j];
         }
      }
      return x;
   }
   
   public char[][] createCharArray()
   {
      int row = 4;
      int column = 4;
      char[][] z = new char[row][column];
      for(int i = 0; i < row; i++)
      {
        for(int j = 0; j < column;j++)
         {
            z[i][j] = str.charAt(j + i * column);  
         }
      }
      
      return z;
   }
}