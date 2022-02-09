public class BallsApp {
    public static void main(String args[]){

        Balls ball1 = new Balls();
        ball1.setVelocity(25);
        ball1.hit();
        BaseBall b1 = new BaseBall();
        b1.hit();
        SoftBall sf1 = new SoftBall();
        sf1.riseBall();
    }
}
