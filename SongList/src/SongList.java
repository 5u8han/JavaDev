// The SongList class that represents a circular linked list of Song nodes
// Subhan Noeman
public class SongList {
    private Song m_last;
    private int m_numElements;
    public SongList(){
        m_last = null;
        m_numElements = 0;
    }

    boolean isEmpty(){
        if (m_last == null)
            return true;
        else
            return false;
    }
    public int size()
    {
        return m_numElements;
    }

    // add a new Song to the circular linked list with the given artist and 
    // title, keeping the list sorted by *song title*.
    public void add(String artist, String title)
    {
        Song temp = new Song(artist,title);
        //This is to insert in a empty list.
        if (m_last == null){
            m_last = temp;
            temp.setLink(m_last);
            m_numElements++;
        }
        // this is to insert to the front of the list

        Song current = m_last.getLink(); // This statement will get m_last which would be the front of the next
        if (current.getTitle().compareToIgnoreCase(title) >0){
            temp.setLink(current);
            m_last.setLink(temp);
            m_numElements++;
            // How this is, is that we will get the last node in the link, then we will compare, and set accordingly
        }

        // inserting to the middle of the list

        while (current != m_last && current.getLink().getTitle().compareToIgnoreCase(title) <0){
            // Thank google for this expression,
            // this will compare all elements up to when its <0
            current=current.getLink();
            if (current== m_last){
                temp.setLink(m_last.getLink());
                m_last.setLink(temp);
                m_last = temp;
            }
            else {
                temp.setLink(current.getLink());
                current.setLink(temp);
            }
        }
    }

    // remove a Song associated with the given artist and title from the list,
    // keeping the list sorted by *song title*.
    public boolean remove(String artist, String title)
    {

        if (m_last==null){return false;} //Base case
        Song previous;
        Song current;

        if (m_last.getLink()==m_last && m_last.getArtist().equals(artist)&& m_last.getTitle().equals(title))
        {
            //this expression compares the value that are passed into the method beong artist and title
            //It compares using the m_last which gives us the head or 1st link vice versa

            m_last=null;
            m_numElements--; // if it matches, remove it
            return true;
        }

        current = m_last.getLink();// point to the next node or element
        previous = m_last;
        //The node pointer has been moved to the next element in the L list

        do {
            if (current.getArtist().equals(artist)&& current.getTitle().equals(title))
            {
                previous.setLink(current.getLink());
                if (current == m_last)
                    m_last=previous;
                m_numElements--;
                return true;
            }
            else
                previous = current;
            current = current.getLink(); // move to next node / element in the linked list
        } while (previous !=m_last);
        return false;
    }

    // build and return a circular linked list that contains all songs from the
    // given artist
    public SongList buildList(String artist) {
    if (m_last==null){return null;} //Base case
        SongList temp = new SongList();
        Song current = m_last;
        do {
            current = current.getLink();
            if (current.getArtist().equals(artist))
                temp.add(current.getArtist(), current.getTitle());
        } while (current !=m_last);
        return temp;
    }
    public String toString() {
        String listContent = "";
        Song current = m_last;
        if (m_last != null)
        do {
            current = current.getLink();
            listContent += "  [" + current.getArtist() + " - " + current.getTitle() + "]\n";
        } while (current != m_last);
        return listContent;
    }
}