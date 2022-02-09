public class HouseCat extends Cat implements IVocalize{
    public HouseCat(){
        super(2);
    }

    @Override
    public void vocalize() {
        System.out.println("HouseCat says Purr!!!!");
    }
}
