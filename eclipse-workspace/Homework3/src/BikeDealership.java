/* 
 * CS207-1 NEIU Spring 2019
 * This class models a motorcycle dealership.  Each software representation of a
 * motorcycle that this class uses needs to track it's own values for make, model,
 * year, number, pre owned, and price.  Likewise, each motorcycle needs to be able
 * compare itself to another motorcycle for equality.
 * 
 * Do not modify this file!
 */
public class BikeDealership
{
   public static void main( String[] args )
   {
      // Instantiate objects of type Motorcycle
      Motorcycle m1 = new Motorcycle( "Harley-Davidson", "Softail", 2018, 1 );
      Motorcycle m2 = new Motorcycle( "Kawasaki", "Ninja", 2004, 2 );
      Motorcycle m3 = new Motorcycle( "Honda", "Gold Wing", 2005, 3 );
      Motorcycle m4 = new Motorcycle( "Ducati", "Diavel", 2019, 4 );
      
      // Use their setters to store their status as used or new
      m1.setPreOwned( false );
      m2.setPreOwned( true );
      m3.setPreOwned( true );
      m4.setPreOwned( false );
      
      // Set each price
      m1.setPrice( 11244.0 );
      m2.setPrice( 8350.0 );
      m3.setPrice( 4800.0 );
      m4.setPrice( 13250.0 );

      // this is a 1-D array and is holding the values of the objects mentioned on top
      //Such as m1, m2, m3 and m4?  
      Motorcycle[] forSale = new Motorcycle[4];
      forSale[0] = m1;
      forSale[1] = m2;
      forSale[2] = m3;
      forSale[3] = m4;
      
      System.out.println( "Motorcycles in inventory with prices: " );
      String output;
      
      // loop is starting at 0 and running up to the last element of the array
      // loop is going through each element of the array "forSale" created above and
      // is executing its own set of commands as it runs through the values.
      for( int index = 0; index < forSale.length; index++ )
      {
         output = "Make: " + forSale[index].getMake() + "\n";
         output += "Model: " + forSale[index].getModel() + "\n";
         output += "Year: " + forSale[index].getYear() + "\n";
         output += "Used?: " + forSale[index].getPreOwned() + "\n";
         output += "Asking: $" + forSale[index].getPrice() + "\n";
         System.out.println( output );
      }
      
      // Not until data is entered. which is compared using the isEqual method.
      //when confirmed, the method will return true, otherwise false.
      Motorcycle m5 = new Motorcycle( "Kawasaki", "Ninja", 2004, 2 );
      
      boolean same = m5.isEqual(m2);
      System.out.println( "Is m5 equal to m2? " + same );
      same = m5.isEqual( m3 );
      System.out.println( "Is m5 equal to m3? " + same );
   }
}