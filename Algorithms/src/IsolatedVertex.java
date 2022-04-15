public class IsolatedVertex {

    // Write your method here:

    public static int isolatedVertex(int n, int [][] W) {
        for (int row = 1; row<W.length; row++){
            boolean bool = true;
            for (int col = 1; col < W[row].length; col++){
                if (W[row][col] != 0){
                    bool = false;
                }
            }
            if (bool == true)  return row;
        }
        return -1;
    }
      /* boolean bool;
        int col, row, temp = 0;
            for (row = 0; row < W.length; row++) {
                for (col = 0; col < W[row].length; col++) {
                    if (W[row][col] != 0) {
                        bool = true;
                    }
                }
                if (bool = false)
                    temp = W[row][col];

            }
            return temp;
    }

       */






    // This main method tests your code on the 4 test cases below main.

    public static void main(String [] args) {
        System.out.println(isolatedVertex(1,W1));

    }




    // HERE ARE 5 TEST CASES FOR YOU TO TEST YOUR CODE:


    public static int [][] W1 =
            {
                    {},
                    {-1, 0, 1, 0, 1},
                    {-1, 1, 0, 1, 1},
                    {-1, 0, 0, 0, 0},
                    {-1, 1, 1, 0, 0}

            };


    public static int [][] W2 =
            {
                    {},
                    {-1, 0, 1, 0, 1},
                    {-1, 1, 0, 0, 1},
                    {-1, 0, 0, 0, 0},
                    {-1, 1, 1, 0, 0}

            };


    public static int [][] W3 =
            {
                    {},
                    {-1, 0, 1, 0, 1},
                    {-1, 1, 0, 1, 1},
                    {-1, 0, 1, 0, 0},
                    {-1, 1, 1, 0, 0}

            };



    public static int [][] W4 =
            {
                    {},
                    {-1, 0, 1, 0, 1, 0, 0, 1, 0, 0},
                    {-1, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                    {-1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                    {-1, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                    {-1, 0, 1, 1, 0, 0, 1, 0, 0, 0},
                    {-1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
                    {-1, 1, 0, 0, 1, 0, 1, 0, 1, 0},
                    {-1, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                    {-1, 0, 0, 1, 0, 0, 1, 0, 0, 0}
            };


    public static int [][] W5 =
            {
                    {},
                    {-1, 0, 1, 0, 1, 0, 0, 1, 0, 0},
                    {-1, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                    {-1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                    {-1, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                    {-1, 0, 1, 1, 0, 0, 1, 0, 0, 0},
                    {-1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
                    {-1, 1, 0, 0, 1, 0, 1, 0, 0, 0},
                    {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {-1, 0, 0, 1, 0, 0, 1, 0, 0, 0}
            };





}

