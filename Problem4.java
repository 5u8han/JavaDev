public class Problem4 {
   
   public static void main (String [] args) {
   
   int [][] a = {
              { 8  , 9  , 31 , 4  , 29 , 12 ,},
              { 7  , 23 , 73 , 12 , 6  , 30 ,},
              { 13 , 42 , 42 , 18 , 5  , 15 ,},
              { 4  , 7  , 32 , 43 , 15 , 17 ,} }; 
              
   int [][] b = {
              { 32 , 45 , 67 , 21 , 3  , 8  ,},
              { 12 , 65 , 23 , 27 , 12 , 18 ,},
              { 19 , 32 , 14 , 18 , 19 , 27 ,},
              { 39 , 48 , 29 , 26 , 32 , 44 ,},
              { 17 , 28 , 37 , 38 , 22 , 19 ,} };
              
   int [][] c = mirror (a) ;
   int [][] d = mirror (b) ;  
      
      int i , j ;
      for(i = 0 ; i < c.length; i++){
         for(j = 0 ; j < c[0].length; j++){
            System.out.print(c[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println();
      
      for(i = 0 ; i < d.length; i++){
         for(j = 0 ; j < d[0].length; j++){
            System.out.print(d[i][j] + " ");
         }
         System.out.println();
      }
            
   }
   public static int [][] mirror (int [][] array)
   {
      int i , j ;
      
      int [][] flipCol = new int [array.length][array[0].length];
      
      int temp = 0;
      
      for(i = array.length -1 ; i  >= 0; i--)
      {
         for(j = 0 ; j <array[i].length ; j++)
         {
            flipCol[temp][j] = array[i][j];
         }
         temp++;
      }
   
      return flipCol;
   }
}