public class Employee extends Person{
    private String firstName;
    private String lastName;
    private int Ssn;
    private double Salary;

    public Employee(){
       super();
       this.Salary =0.0;
    }
    public Employee(String firstName, String lastName, int ssn, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        Ssn = ssn;
        Salary = salary;
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

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
    @Override
    public boolean equals(Object obj) {
        super.equals(obj);

        Employee e1 = (Employee) obj;
        if(this.Salary == e1.Salary){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        String str = super.toString()+"\nSalary: "+this.Salary;
        return str;
    }

}
