public class Test
{
    public static void main (String args []){
        myRec(25,20,30);
        int [] A = {87,31,15,25,10,15,21,17};
        oddSum(A,4);
        int n=100;
        for (int i = 1; i < n; i *= 2)
            for (int j = 0; j < n - 1; j++)
                System.out.println(i + "," + j);
    }
    public static void myRec(int a, int b, int c){
        if (a>4){
            myRec(b-3,c-4,a/2);
            System.out.println("b is: "+b);
        }
        else System.out.println("a is:"+a);
    }
    public static boolean oddSum(int[] A, int pos){
        if (pos == A.length-1){
            return (A[pos]%2 !=0);
        }
        else {
            boolean isOddCurrent = (A[pos] % 2 != 0);
            boolean isOddRest    = oddSum(A,pos+1);
            return (isOddCurrent !=isOddRest);
        }

    }


}
