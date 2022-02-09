public class Employee extends Person {
    public double salary;

    public Employee() {
        super();
    }

    public Employee(String firstName, String lastName, int id, double salary) {
        super(firstName, lastName,id);
        this.salary = salary;

    }

    @Override

    public String toString() {
        String str = "First Name: " + this.firstName + "\nLast Name: " + this.lastName
                + "\nID: " + this.id + "\nSalary: " + this.salary;
        return str;
    }

}

    /*PROGRAM OUTPUT
First Name: John
Last Name: Smith
ID: 27

First Name: Maria
Last Name: Rodriguez
ID: 998
Salary: 78345.0
*/

