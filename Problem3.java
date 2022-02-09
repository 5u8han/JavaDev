public class Problem3 {
   
   public static void main(String [] args){
   
      int [][] array = {
                        { 8 , 9 , 31 , },
                        { 7 , 23 , 73 , 24 ,},
                        { 13 , 19 , } };
                        
    int [][] array1 = {
                      { 32 , 13 , 45 , },
                      { 12 , 100 , 56 , 94 , },
                      { 19 , },
                      { 32 , 120 ,} }; 
                      
   int [] a = linearize(array);
   int [] b = linearize(array1);
   
      int i ;
      for(i = 0 ; i < a.length ; i++){
         System.out.print(a[i] + " ");
      }
      System.out.println();
      
      for(i = 0 ; i < b.length ; i++)
      {
         System.out.print(b[i] + " ");
      }
      System.out.println();
                                         
   }
   public static int[] linearize ( int [][] arr)
   {
      int i , j , count = 0 ;
      
      for (i = 0 ; i < arr.length ; i++)
      {
         for(j = 0 ; j < arr[i].length; j++)
         {
            count++;
         }
      }
      int [] a = new int [count];
      
      int x = 0;
      for(i = 0 ; i < arr.length ; i++)
      {
         for(j = 0 ; j < arr[i].length ; j++)
         {
            a[x] = arr[i][j];
            x++; 
         }
      }
      return a; 
   } 
}