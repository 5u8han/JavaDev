// The Song class that represents a song
// Do not make any changes to this file!
// Xiwei Wang

public class Song
{
    // instance variables
    private String m_artist;
    private String m_title;
    private Song m_link;

    // constructor
    public Song(String artist, String title)
    {
        m_artist = artist;
        m_title = title;
        m_link = null;
    }

    // getters and setters
    public void setArtist(String artist)
    {
        m_artist = artist;
    }

    public String getArtist()
    {
        return m_artist;
    }

    public void setTitle(String title)
    {
        m_title = title;
    }

    public String getTitle()
    {
        return m_title;
    }
    
    public void setLink(Song link)
    {
        m_link = link;
    }

    public Song getLink()
    { 
        return m_link;  
    }
}
 
 