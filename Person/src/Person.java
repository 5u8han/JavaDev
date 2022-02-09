public class Person {
    public String m_name;
    protected int m_age;

    public Person(String name, int age) {
        m_name = name;
        m_age = age;
    }

    public int getAge() {
        return m_age;
    }
}