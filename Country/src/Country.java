/*
Subhan Noeman - 623424
Professor Sotak
Programming 207 - Assignment #2
 */

public class Country {

        private String Name;
        private int Pop;
        private String capital;

 public Country(String name, int pop, String capital){
            this.Name = name;
            this.capital = capital;
            this.Pop = pop;
}

                public void setName(String name) {
                   this.Name = name;
                }
                public String getName() {
                    return this.Name;
                }
                public void setPop(int pop) {
                    this.Pop = pop;
                }
                public int getPop() {
                    return Pop;
                }
                public void setCapital(String capital) {
                    this.capital = capital;
                }
                public String getCapital() {
                    return capital;
                }

@Override

    public String toString(){
            String str = "Name: "+this.Name+" Population: "+this.Pop+" Capital: "+this.capital+" \n";
            return (str);
    }
}
