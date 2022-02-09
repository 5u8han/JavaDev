import java.lang.Math;
public class Selection
{

    public static void main(String[] args)
    {
        int [] num=new int[10];
        for (int i = 0; i < num.length-1; i++){
            num[i] = (int)(Math.random()*1000);
            System.out.println(num[i]);

        }
        System.out.println("this is my fun:");
        System.out.println(myFun(4));

        int i, j, first, temp;
        int comparecount = 0;
        int swapcount = 0;

        System.out.println();

        for ( i = num.length - 1; i > 0; i-- )
        {
            first = 0;
            for(j = 1; j <= i; j ++)
            {
                comparecount++;

                if( num[ j ] < num[ first ] )
                    first = j;
            }
            temp = num[ first ];   //need to count swaps ???
            num[ first ] = num[ i ];
            num[ i ] = temp;
        }

        System.out.print(comparecount);
        System.out.print(swapcount);


    }
    public static int myFun(int n)
    {
        if (n > 1)
            return (myFun(n - 1) + myFun(n / 2));
        else
            return 1;
    }
    newNode = m_root;
        if (m_root == null){
    m_root = newNode;
}
        else {

    tempNode = m_root;
    if (tempNode.getLeft() == i){
        return reheapDownRec (A, tempNode.getLeft().getValue());
    }
    else if (tempNode.getRight() == i){
        return reheapDownRec (A, tempNode.getRight().getValue());
    }
    else if (tempNode.getInfo() != i && tempNode.getLeft() != null){
        return reheapDownRec (A, tempNode.getLeft())
    }
    else if(tempNode.getInfo() != i && tempNode.getRight() != null){
        return reheapDownRec (A, tempNode.getRight())
    }
}
}
