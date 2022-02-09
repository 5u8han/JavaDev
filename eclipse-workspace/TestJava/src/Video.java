public class Video {

    public String title = "Star Wars";
    public int length=120;


    public Video(){
        System.out.println("you created a generic video" );

    }

    public Video(String title, int length){
        this.title = title;
        this. length=length;
    }
    public void info(){
        String s = "Title: "+title+"\nTime" +
                length;
        System.out.println(s);
    }
}
