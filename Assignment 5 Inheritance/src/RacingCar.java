public class RacingCar
{
    private String shape;
    private int speed;
    private double weight;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        RacingCar Rc = (RacingCar) obj;
        if (this.shape.equals(Rc.getShape())&& this.getWeight()==Rc.getWeight() && this.getSpeed()==Rc.getSpeed()){
            return true;
        }
        return false;

    }

}

