public class EmployeeApp
{
    public static void main(String [] args)
    {
        Person p1 = new Person("John", "Smith", 27);
        Employee e1 = new Employee("Maria", "Rodriguez", 998, 78345);

        System.out.println(p1);
        System.out.println();
        System.out.println(e1);

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