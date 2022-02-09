public class LinkedList
{
    private LNode head; // a reference to the first node
    // in the list
    public LinkedList()
    {
        head = null;
    }

    public void saveCountinLastNode()
    {
        // TODO: implement this method
        LNode temp = head;
        int count =0;
        while (temp !=null){
            count++;
            temp.getLink();
            temp.setLink(head.getLink());
        }
    }

    // This recursive method computes the sum of all the nodes
    // with odd values.
    // You will receive zero points if any looping statements
    // are used.
    public int addOddNodes(LNode node)
    {
        // TODO: implement this method
        int total =0;
        if (node == null){
            return 0;
        }

        if (node.getInfo()%2==1){
            return  total+node.getInfo() +addOddNodes(node);
        }
        return total;
    }
}