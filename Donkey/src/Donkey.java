public class Donkey {
    public static int n = 0;

    private String name;

    public Donkey(String name)
    {
        this.name = name + n;
        System.out.println(this.name + " DK");
        n += name.length();
    }
    public void heehaw(String n)
    {
        Donkey.n += n.length();
        System.out.println("HEE" + n);
    }
    public void heehaw(Donkey d)
    {
        heehaw(d.name);
    }
}

