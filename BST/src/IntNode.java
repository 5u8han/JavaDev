public class IntNode {
    private int m_data;
    private IntNode m_link;

    public IntNode(int data, IntNode link) {
        m_data = data;
        m_link = link;
    }

    public int getInfo() {
        return m_data;
    }

    public IntNode getLink() {
        return m_link;
    }


    int countDoubles(IntNode myList) {
        int counter =0;
        if ( myList.getLink() != null )
        {
            if ( myList.getInfo() == myList.getLink().getInfo() *2 ) { counter++; }
            counter += countDoubles(myList.getLink());
        }
        else{ counter += countDoubles(myList.getLink());}
        return counter;
}
}