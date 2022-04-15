public class ThreePoints {

    public static void main(String [] args) {
        int [] temp =(threeIdenticalPoints(pts.length, pts));
        int count=0;
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);

        }
      /*  for (int i = 0; i < pts.length-1; i++) {
            System.out.println("iLength: "+ pts.length);
            for (int j = 0; j < pts[i].length; j++) {
                System.out.println("jlength"+pts[i].length);
                if (pts[i][j] == pts[i+1][j]){
                    System.out.println("Same: "+pts[i][j] +","+ pts[i+1][j]);
                    count++;
                }
            }
        }*/

    }

    // Write this method:

    public static int [] threeIdenticalPoints(int n, int [][] pts) {
        int[] temp = new int[pts.length];
        int[] tempReturn = {-1,-1,-1};
        int[] returnArray= new int [3];


        for (int i=0; i<pts.length; i++){
            for (int j=0 +i; j<pts[0].length;j++){
                for (int k = 0 +j; k < pts[0].length; k++) {
                    if (pts[0][i] == pts[0][j] && pts[0][i] == pts[0][k] && pts[1][i] == pts[1][j] && pts[1][i] == pts[1][k]){
                        returnArray[0]= i;
                        returnArray[1]=j;
                        returnArray[2]=k;
                        return new int []{i,j,k};
                    }

                }
            }
        }
      /*  for (int i=0;i<pts.length-1; i++){
            for (int j=0;j<pts[i].length;j++) {
                if (pts[i][j] == pts[i + 1][j]) {
                    temp[i] = pts[i][j];
                }
            }
        }
    return  temp;
*/

        return tempReturn;
    }


    public static int[][] pts = {
            {3,3,20,9,16,20,9,3,3,9,3},
            {5,-8,13,17,13,13,5,40,13,17}
    };



  /*  public static int[][] pts = {

            {3, 5},
            {20, -8},
            {9, 13},
            {16, 17},
            {20, 13},
            {9, 13},
            {3, 5},
            {3, 40},
            {9, 13},
            {3, 17}
    };

*/
}
