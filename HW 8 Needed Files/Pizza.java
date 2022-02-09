public abstract class Pizza
{
   private String size;
   protected String shape;
   
   public Pizza( String size, String shape )
   {
      this.size = size;
      this.shape = shape;
   }
   
   public String getSize()
   {
      return this.size;
   }
   
   public String toString()
   {
   
      String s = this.shape + " pizza";
      return s;
   }
   
   /* Abstract method chooseToppings() */
   public abstract void chooseToppings();

}