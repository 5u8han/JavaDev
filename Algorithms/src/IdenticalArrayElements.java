public class IdenticalArrayElements {
    public static void main(String[] args) {
        int[] A = {8, 9, 10, 9, 12, 9, 10, 8};
        int[] tempArray = coordsIdenticalElements(A.length, A);

        for (int i=0; i<tempArray.length;i++) {
            System.out.print(tempArray[i]+ " ");
        }

    }


    public static int[] coordsIdenticalElements(int n, int[] A) {
        int[] tempArray = {-1,-1};
        for(int j =0;j<n;j++){
            for(int i =0;i<n;i++){
                if(A[i]==A[j] && i != j){
                    tempArray[0]=j;
                    tempArray[1]=i;
                    return tempArray;
                }
            }
        }

        return tempArray;

    }
}

