public class book{
	
   String title;
   int totalbooks;
   double price;
   int quantity;
   String author;
   String genre = "Sci-fi";
   private int isbn;
   
   
   public book(String title) {
	   System.out.println("Start contructing");
	   
	   this.title=title;
	   totalbooks++;
	   
   }
   
   
   public void setTitle(String t){
      title = t;  
   }
   
   public void printTitle(){
	   System.out.println("Title: "+title);
   }  
   public void setGenre(String g){
	   genre = g;
}
   public void printGenre(){
	   System.out.println("Genre: "+genre);
}
   public void setPrice(double p) {
	   p=price;
}
   public void printPrice() {
	   System.out.println(price);
   }

}