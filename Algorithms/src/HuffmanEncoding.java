import java.util.Arrays;
import java.util.PriorityQueue;

public class HuffmanEncoding
{
    public static void main(String[] args)
    {
        Character[] letters = new Character[5];
        letters[0] = 'a';
        letters[1] = 'b';

        for( int i=2; i<letters.length; i++ )
        {
            char newChar = (char)('a' + (Math.random()*26));
            while( Arrays.asList(letters).indexOf(newChar)>=0 )
            {
                newChar = (char)('a' + (Math.random()*26));
            }
            letters[i] = newChar;
        }
        int[] freq = new int[letters.length];
        String msg = "";
        boolean matchFreq = true;
        while( matchFreq )
        {
            msg = "";
            freq = new int[letters.length];
            int n = 30 + (int)(Math.random()*14);
            for( int i=0; i<n; i++ )
            {
                msg = msg + letters[(int)(Math.min(letters.length*Math.random()*1.25, letters.length-1))];
            }

            /* frequencies */
            for( int i=0; i<msg.length(); i++ )
            {
                int idx = Arrays.asList(letters).indexOf(msg.charAt(i));
                freq[idx]++;
            }
            matchFreq = false;
            for( int i=0; i<freq.length; i++ )
            {
                for( int j=i+1; j<freq.length; j++ )
                {
                    if( freq[i] == freq[j] )
                    {
                        matchFreq = true;
                    }
                }
            }
        }


        /* HUFFMAN ENCODING begins here - frequencies are already counted */
        /* create Nodes */
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->(a.count-b.count));
        /* fill with nodes */
        for( int i=0; i<letters.length; i++ )
        {
            Node tmp = new Node(letters[i], freq[i]);
            pq.offer(tmp);
        }

        while( pq.size() > 1 )
        {
            Node n1 = pq.poll();
            Node n2 = pq.poll();
            Node sum = new Node((char)0, n1.count+n2.count);   /* no char */
            sum.left = n1;
            sum.right = n2;
            pq.offer(sum);
        }
        String[] paths = new String[letters.length];
        Node nodeFinal = pq.poll();
        dfs(nodeFinal, paths, letters, new StringBuilder());
        System.out.println("----------------------------------");
        System.out.println("Original Message: " + msg);
        System.out.println("Char   Freq  Path");
        System.out.println("-----------------");
        for( int i=0; i<letters.length; i++ )
        {
            System.out.println(letters[i] + "\t\t" + freq[i] + "\t\t" + paths[i]);
        }

        String enc = "";
        for(int i=0; i<msg.length(); i++ )
        {
            int idx = Arrays.asList(letters).indexOf(msg.charAt(i));
            enc += paths[idx];
        }
        System.out.println("Encoded message:\n" + enc);
        System.out.println("Number of characters in message: " + msg.length());
        System.out.println("Ascii bit count: " + msg.length() * 8);
        System.out.println("Huffman bit count: " + enc.length());

        System.out.println("\nGoodbye!");

    }
    public static void dfs(Node n, String[] paths, Character[] letters, StringBuilder path)
    {
        if( n.left == null && n.right == null )
        {
            int idx = Arrays.asList(letters).indexOf(n.c);
            paths[idx] = path.toString();
            return;
        }
        if( n.left != null )
        {
            path.append("0");
            dfs(n.left, paths, letters, path);
            path.deleteCharAt(path.length()-1);
        }
        if( n.right != null )
        {
            path.append("1");
            dfs(n.right, paths, letters, path);
            path.deleteCharAt(path.length()-1);
        }
    }
}





class Node
{
    Character c;
    int   count;
    Node left, right;

    Node(Character c, int count)
    {
        this.c = c;
        this.count = count;
    }
}
