public class Ball {
    private String shape;

    public Ball(String shape) {
        this.shape = shape;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Ball otherObject = (Ball) obj;

        if (this.shape==otherObject.shape){
             return true;
        }
        return false;
    }
}
