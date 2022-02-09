public class cartoonDonkey extends Donkey {
    private int cd ;

    public cartoonDonkey( ){
        super("Donkey");
        this.cd=10;
        System.out.println(this.cd +" CD1");
    }
    public cartoonDonkey(String n){
        super(n);
        System.out.println(this.cd + " CD2");
        this.cd = Donkey.n;
    }
    public void heehaw(String s)
    {
        Donkey.n += this.cd + s.length();
        System.out.println("HAW " + Donkey.n);
    }
}
