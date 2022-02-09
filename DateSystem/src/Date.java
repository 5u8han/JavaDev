// The Date class that represents dates
// Do not make any changes to this file!
// Xiwei Wang
// Prof, if you see this, I am confusion. variable naming scheme.
import java.io.*;

public class Date implements Serializable
{
    // instance variables
    protected int m_year;
    protected int m_month;
    protected int m_day;

    // copy constructor
    public Date(Date o)
    {
        m_year = o.m_year;
        m_month = o.m_month;
        m_day = o.m_day;
    }

    // constructor
    public Date(int month, int day, int year)
    {
        m_year = year;
        m_month = month;
        m_day = day;
    }

    // observers
    public int getYear()
    {
        return m_year;
    }

    public int getMonth()
    {
        return m_month;
    }

    public int getDay()
    {
        return m_day;
    }

    // compare the current date with the parameter d.
    // return -1 if it's earlier than d, return 0 if they are identical, and
    // return 1 if the current is later than d.
    public int compareTo(Date d)
    {
        // current is earlier than d
        if (m_year < d.m_year)
            return -1;

        // current is later than d
        if (m_year > d.m_year)
            return 1;

        // current and d are in the same year
        // current is earlier than d in terms of month
        if (m_month < d.m_month)
            return -1;

        if (m_month > d.m_month)
            return 1;

        // current and d are in the same year and same month
        // current is earlier than d in terms of day
        if (m_day < d.m_day)
            return -1;

        if (m_day > d.m_day)
            return 1;

        return 0; // two dates are exactly the same
    }

    // return this date as a String
    public String toString()
    {
        return (m_month + "/" + m_day + "/" + m_year);
    }
}
