public class Student extends Person {
    private double m_gpa;

    public Student(String name, int age, double gpa) {
        super(name, age);
        m_gpa = gpa;
    }

    public void decrementAge()
    {
        m_age--;
    }
}

