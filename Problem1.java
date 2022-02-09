public class Problem1 {
   
   public static void main(String [] args) {
   
      char [][] studentsAnswers = 
                           {{'A' , 'D' , 'B' , 'A' , 'B' , 'E' , 'A' , 'D' , 'E' , 'B', },
                           { 'B' , 'C' , 'E' , 'C' , 'E' , 'E' , 'E' , 'D' , 'E' , 'B', },
                           { 'A' , 'B' , 'D' , 'E' , 'A' , 'D' , 'C' , 'D' , 'A' , 'B' ,},
                           { 'B' , 'B' , 'D' , 'E' , 'B' , 'E' , 'C' , 'C' , 'A' , 'D' ,},
                           { 'A' , 'B' , 'D' , 'E' , 'C' , 'A' , 'B' , 'D' , 'E' , 'C' ,},
                           { 'A' , 'B' , 'D' , 'E' , 'D' , 'C' , 'E' , 'B' , 'C' , 'E' ,},
                           { 'B' , 'D' , 'E' , 'C' , 'A' , 'D' , 'B' , 'E' , 'B' , 'B' ,},
                           { 'C' , 'D' , 'D' , 'C' , 'B' , 'E' , 'A' , 'D' , 'E' , 'B' ,},
                           { 'B' , 'D' , 'E' , 'A' , 'B' , 'D' , 'E' , 'A' , 'C' , 'D' ,},
                           { 'B' , 'E' , 'E' , 'A' , 'A' , 'E' , 'A' , 'B' , 'E' , 'B' ,},
                           { 'B' , 'D' , 'E' , 'A' , 'B' , 'D' , 'E' , 'D' , 'E' , 'B' ,},
                           { 'B' , 'D' , 'E' , 'C' , 'B' , 'E' , 'B' , 'D' , 'C' , 'E' ,}
                           };
    
      char [] key =         
                          { 'B' , 'D' , 'E' , 'A' , 'B' , 'E' , 'E' , 'D' , 'E' , 'B'};
                          
      int a = numberOfStudentsPassed(studentsAnswers ,  key) ; 
      
      System.out.println(a);
                       
   }
   public static int numberOfStudentsPassed (char [][] answers , char [] key){
   
      int i , j , count = 0 , totalCount = 0; 
      
      for(i = 0 ; i < answers.length ; i++)
      {
         for(j = 0 ; j <answers[0].length; j++)
         {
            if(key[j] == answers[i][j])
               count++;
         }
         if (count >= 6)
            totalCount++ ;
            
         count = 0 ;
      }
   
   
      return totalCount ;
   }
}