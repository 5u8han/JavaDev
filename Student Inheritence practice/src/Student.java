public class Student extends Person{
    private String firstName;
    private String lastName;
    private int Ssn;
    private double gpa;

    public Student(){
       super();
        this.gpa = 0.0;
    }
    public Student(String firstName, String lastName, int ssn, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        Ssn = ssn;
        this.gpa = gpa;
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
        return Ssn;
    }


    public void setSsn(int ssn) {
        Ssn = ssn;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public boolean equals(Object obj) {
        super.equals(obj);
        Student otherStudent = (Student) obj;
        if (this.gpa == otherStudent.gpa){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        String str = super.toString()+"\nGPA: "+this.gpa;
        return str;
    }
}