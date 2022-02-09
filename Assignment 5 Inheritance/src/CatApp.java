public class CatApp {
    public static void main(String args[]){
        HouseCat hc = new HouseCat();
        System.out.println("HouseCat type is: "+hc.getType());
        hc.vocalize();

        Lion lion = new Lion();
        System.out.println("Lion type is: "+lion.getType());
        lion.vocalize();
    }
}
