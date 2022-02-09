public class Person
{
    //data members
    public String firstName;
    public String lastName;
    public int id;

    //constructors
    public Person()
    {
        this.firstName = "";
        this.lastName = "";
        this.id = 0;
    }

    public Person(String fn, String ln, int id)
    {
        this.firstName = fn;
        this.lastName = ln;
        this.id = id;
    }

    //get-set methods
    public String getFirstName()
    {
        return(this.firstName);
    }
    public String getLastName()
    {
        return(this.lastName);
    }
    public int getID()
    {
        return(this.id);
    }
    public void setFirstName(String fn)
    {
        this.firstName = fn;
    }
    public void setLastName(String ln)
    {
        this.lastName = ln;
    }
    public void setID(int id)
    {
        this.id = id;
    }

    //utility methods
    @Override
    public String toString()
    {
        return("First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nID: " + id);
    }
}