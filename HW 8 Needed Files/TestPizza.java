public class TestPizza
{
   public static void main( String[] args )
   {
      DeepDish pizza1 = new DeepDish( "Small", "Round" );
      pizza1.chooseToppings();
      System.out.println( pizza1.toString() );

      System.out.println();

      DeepDish pizza2 = new DeepDish( "Large", "Rect" );
      pizza2.chooseToppings();
      System.out.println( pizza2.toString() );
   
   }
}