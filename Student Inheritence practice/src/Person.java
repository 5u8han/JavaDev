public class Person {
    private String firstName;
    private String lastName;
    private int ssn;

    public Person(){
        this.firstName =" ";
        this.lastName=" ";
        this.ssn=0;
    }
    public Person (String Fn, String Ln, int ssn){
        this.firstName = Fn;
        this.lastName = Ln;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.getClass()== null){
            return false;
        }
        else if (this.getClass()!= obj){
            return false;
        }
        Person p = (Person) obj;
        if(this.firstName.equals(p.firstName)&&this.lastName.equals(p.lastName)&&this.ssn==p.ssn){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String str = "First Name: "+ this.firstName +"\nLast Name: "
                +this.lastName+"\nSSN: "+this.ssn;
        return str;
    }
}
