public class Test
{
    static int i = 22;
    static int j = 33;

    public static void main(String[] args)
    {
        int i = 21;
        int k = 32;
        {
            int j = 3;
            System.out.println("i + j is " + i + j);
        }

        k = i + j;
        System.out.println("k is " + k);
        System.out.println("j is " + j);
    }
}
