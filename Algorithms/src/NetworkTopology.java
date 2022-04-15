public class NetworkTopology {
    public static boolean isMesh(int n, int[][] W) {
        int[] poop = new int[W.length];
        int temp = 0;
      /*  for (int row =1; row < W.length; row++){
            for (int col =1; col < W[row][col]; col++){
                if (W[row][col] !=1 || W [col][row] != 1)
                {
                    return false;
                }
            }
        }

        return true;
       */
        for (int i = 0; i < poop.length; i++) {
            for (int j = 0; j < poop.length; j++) {
                if (W[i][j] == 1) {
                    poop[i]++;
                }
            }
        }
        for (int i = 0; i < poop.length; i++)
            temp += i;

        int x = (int) (Math.pow(poop.length, poop.length) - poop.length);
        if (temp == x) {
            return true;
        }


        return false;
    }

    public static boolean isStar(int n, int[][] W) {
       /* int vertexD1 = 0, vertexDn_1 = 0;
            if (W.length == 1)
                return (W[0][0] == 0);

                if (W.length == 2)
                return (W[0][0] == 0 &&
                        W[0][1] == 1 &&
                        W[1][0] == 1 &&
                        W[1][1] == 0);

            for (int i = 1; i < W.length; i++)
            {
                int degreeI = 0;
                for (int j = 1; j < W[i].length; j++)
                    if (W[i][j] == 1)
                        degreeI++;

                if (degreeI == 1)
                    vertexD1++;
                else if (degreeI == W.length - 1)
                    vertexDn_1++;
            }

            return (vertexD1 == (W.length - 1) &&
                    vertexDn_1 == 1);


        */
        int[] poop = new int[W.length];
        for (int i = 0; i < poop.length; i++) {
            for (int j = 1; j < poop.length; j++) {
                if (W[i][j] == 1) {
                    poop[i]++;
                }
            }
        }
        int sum = 0;

        for (int i = 1; i < W.length; i++)
            sum += i;

        int x = (int) (Math.pow(2, poop.length - 2) - poop.length);
        if (x == sum)
            return true;
        else
            return false;

    }

    public static boolean isRing(int n, int[][] W) {
        int[] poop = new int[W.length];
        for (int i = 0; i < poop.length; i++) {
            for (int j = 1; j < poop.length; j++) {
                if (W[i][j] == 1) {
                    poop[i]++;
                }
            }
        }
        int sum = 0;

        for (int i = 1; i < W.length; i++)
            sum += i;

        int x = (int) (Math.pow(2, poop.length));
        if (x == sum)
            return true;
        else
            return false;



        /*  int row = 0;
        int col = 0;
        while(row < W.length && col < W[0].length) {
            for (int i=0; i< W.length;i++){
                for (int j=0 ; j< W[0].length;j++){
                    if ()
                }
            if(falseRowCount != this.matrix[0].length - 2) {
                return false;
            }
            if(falseColCount != this.matrix.length - 2) {
                return false;
            }
            row++;
            col++;
        }
        return true;
    }
    }*/
    }

        public static String topology ( int n, int[][] W){

            if (isMesh(n, W))
                return "mesh";
            //  else if(isStar(n, W))
            //     return "star";
            //  else if(isRing(n, W))
            //     return "ring";
            //  else
            //      return "none";
            return "";
        }

        public static void main (String[]args){

            System.out.println(isStar(W1.length, W1));
        }

        public static int[][] W1 = {

                {},
                {-1, 0, 1, 1, 1},
                {-1, 1, 0, 1, 1},
                {-1, 1, 1, 0, 1},
                {-1, 1, 1, 1, 0}
        };

        public static int[][] W2 = {

                {},
                {-1, 0, 0, 1, 1, 0},
                {-1, 0, 0, 0, 1, 1},
                {-1, 1, 0, 0, 0, 1},
                {-1, 1, 1, 0, 0, 0},
                {-1, 0, 1, 1, 0, 0},
        };

        public static int[][] W3 = {

                {},
                {-1, 0, 0, 0, 1, 0},
                {-1, 0, 0, 0, 1, 0},
                {-1, 0, 0, 0, 1, 0},
                {-1, 1, 1, 1, 0, 1},
                {-1, 0, 0, 0, 1, 0},
        };

        public static int[][] W4 = {

                {},
                {-1, 0, 1, 1, 0},
                {-1, 1, 0, 1, 1},
                {-1, 1, 1, 0, 1},
                {-1, 0, 1, 1, 0}
        };

        public static int[][] W5 = {

                {},
                {-1, 0, 0, 1, 1, 0},
                {-1, 0, 0, 0, 1, 1},
                {-1, 1, 0, 0, 0, 1},
                {-1, 1, 1, 0, 0, 1},
                {-1, 0, 1, 1, 1, 0},
        };


        public static int[][] W6 = {

                {},
                {-1, 0, 0, 1, 0, 0},
                {-1, 0, 0, 0, 1, 1},
                {-1, 1, 0, 0, 0, 1},
                {-1, 0, 1, 0, 0, 0},
                {-1, 0, 1, 1, 0, 0},
        };


    }

