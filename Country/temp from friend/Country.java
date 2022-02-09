//Kennedy Hach
//207 - 5
//Assignment 1

public class Country
{
   private String name;
   private String capital;
   private int pop;
   
   public Country(String name, int pop, String capital)
   {
      this.name = "";
      this.capital = "";
      this.pop = 0;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public void setCapital(String capital)
   {
      this.capital = capital;
   }
   public void setPopulation(int pop)
   {
      this.pop = pop;
   }
   public String getName()
   {
      return(this.name);  
   }
   public String getCapital()
   {
      return(this.capital);
   }
   public int getPopulation()
   {
      return(this.pop);
   }
   
   @Override
   public String toString()
   {
      String str = "Name: " + this.name +"/nPopulation: " + this.pop + "/nCapital: " + this.capital;
      return(str);
   }
}