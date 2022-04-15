public class ChainMatrixMultiplication {
    public static void main(String[] args) {
        int n = 24;

    int [] [] Matrix = {{5,2},{2,3},{3,4},{4,6},{6,7},{7,8}};
    int cost = recursiveCall(Matrix, 0, Matrix.length-1);
        System.out.println(cost);

        Matrix = new int[n][2];
        int row=0, col = (int) (Math.random()*8)+1;

        for (int i = 0; i < Matrix.length; i++) {
             Matrix [i][0] =row;
             col = (int) (Math.random()*8)+1;
             row = col;

        }



        //icoming dynamic programming
        //introducing memory

        //int [][] mem = new



    }

    void printArray(int [][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println();

        }
    }

    public static int recursiveCall(int[][] Matrix, int start, int end){

        //base case

        if(start==end){return 0;}

        int minCost = 1_00_000_000;

        for (int i =start; i<end ; i++){
            int leftCost = recursiveCall(Matrix, start, i);
            int rightCost = recursiveCall(Matrix, i+1, end);

            int totalCost ;
        }
     return 0;
    }
}
