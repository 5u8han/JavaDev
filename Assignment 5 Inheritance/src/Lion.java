public  class Lion extends Cat implements IVocalize{
    public Lion(){
        super(1);
    }

    @Override
    public void vocalize() {
        System.out.println("Class Lion Says ROAR!!!");
    }

}
