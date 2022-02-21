import java.util.ArrayList;
import java.util.Scanner;

public class HowManyEnteredBeforeBothSeen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean aFound = false;
        boolean bFound = false;
        boolean foundBoth = false;
        int a=0, b=0,count=0;
        ArrayList <Integer> enteryList = new ArrayList();
        a=in.nextInt();
        b=in.nextInt();

        while(foundBoth !=true){
            int i=0;
            enteryList.add(in.nextInt());
            if(enteryList.get(i) ==a){
                aFound = true;
                count++;
                i++;
            }
            if(enteryList.get(i) == b){
                bFound =true;
                count++;
                i++;
            }
            count++;
            i++;

            if(aFound && bFound){
                foundBoth =true;

            }
        }
    }
}




