public class Movie extends Video {
public String director;
public String rating;

public Movie(){
    super();
}
public Movie(String title,int length,String director,String rating){
    super(title,length);
    this.director=director;
    this.rating=rating;
    System.out.println("the director is " + director+" and it's rated" +
            rating);
}
}
