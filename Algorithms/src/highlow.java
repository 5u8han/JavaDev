public class highlow {
    public static void main(String[] args) {
        int[] A = {599, 654,0,1,299,3,5,6,7,800,11,12,13,14,15,687, 102, 229, 599,  16, 19, 21, 24, 99, 98, 55, 23, 55, 104, 224,655,109, 431};
        System.out.println( useful(A, 0, A.length-1) );
    }
    public static int useful(int[] A, int low, int high){
        if (high == low){return A[low];}

        else {
            int m = (low+high)/2;
            int left = useful(A, low, m);
            int right = useful(A, m+1, high);

            if(left>right) return left;
            else return right;
        }
    }
}
