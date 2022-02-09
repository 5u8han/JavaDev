import java.util.Scanner;

public class ExamPrac3{
	
  public static void main (String[] args){
	  
    int big = 0;
    int small = 9001;
    int range = 0;
    int[][] aa1 = new int[3][4];
    aa1[0][0] = 75;
    aa1[0][1] =65;
    aa1[0][2] =55;
    aa1[0][3] =61;
    aa1[1][0] =10;
    aa1[1][1] = 0;
    aa1[1][2] = 5;
    aa1[1][3] =30;
    aa1[2][0] =35;
    aa1[2][1] =80;
    aa1[2][2] =20;
    aa1[2][3] =44;

    
    
        for(int r =0;r < 3;r++)
    {
         for(int i =0;i <4;i++)
           {
                if (aa1[r][i] > big)
                {
                  big = aa1[r][i];
                
                }
               if(aa1[r][i] < small);
               {
                  small = aa1[r][i];
               }
               
             }
         range = (big - small);
         System.out.println("range in row "+r+" is "+ range);
         
    }
    
    
    

   
    
    
    
  }
 
}