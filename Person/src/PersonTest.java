public class PersonTest {
    public static void main(String args[]) {
        Person p = new Person("Joe Doe", 25);
        Student s = new Student("Jane Doe", 20, 3.45);
        String name;
        int age;
        double gpa;

        s.decrementAge();
        age = s.getAge();
        age = p.getAge();
    }
}
