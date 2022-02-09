public class Balls {
    private int velocity;

    public Balls(){
        System.out.println("You called the balls constructor");
        this.velocity =0;
    }
    public void setVelocity(int velocity){
        this.velocity=velocity;
    }
    public void hit(){
        System.out.println("You hit the ball a mile!!!");
    }
}
