// ANSWER THESE QUESTIONS:
//
// Let m = arrA.length and n = arrB.length.
// What is the *maximum* number of comparsons your algorithm makes?:
//
// ANSWER HERE: Since the sequence will check one element from A to each element in B ; it would be 12*10=120 comparisons
//
// What is the *minimum* number of comparsons your algorithm makes?:
//
// ANSWER HERE: 120 from 1 element from A and each element in B

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
public class PrintCommonElements{
    public static void printCommonElements(int [] arrA, int [] arrB)  {
        List<Integer> array = new LinkedList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int element:arrA){set.add(element);}
        for(int element:arrB){if(set.contains(element)) {array.add(element);}
        }
        int[] arr = new int[array.size()];
        for(int i = 0; i < array.size();i++){
            arr[i] = array.get(i);
            System.out.print(arr[i]+" ");
        }
    }
 //     for(int i=0; i<arrA.length;i++){for (int j= 0; j< arrB.length;j++){ if (arrA[i]==arrB[j]){System.out.print(arrA[i] +" ");}}}}
    public static void main(String [] args) {
        int[] A = {1, 1, 3, 3, 6, 9, 9, 9, 10, 20, 30};
        int[] B = {2, 3, 5, 5, 7, 9, 9, 20};
        printCommonElements(A, B);
        // prints multiple times, how do i correct that gosh****
    }
}
