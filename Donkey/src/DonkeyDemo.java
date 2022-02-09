 public class DonkeyDemo
    {
        public static void main(String[] args)
        {
            Donkey d = new Donkey("Pedro");
            cartoonDonkey c = new cartoonDonkey("Gus");
            Eeyore e = new Eeyore();
            e.heehaw(d);
            d.heehaw(c);
            c.heehaw(d);
        }
    }

