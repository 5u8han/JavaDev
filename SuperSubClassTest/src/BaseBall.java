public class BaseBall extends Ball {
    private boolean isBouncable;
    public BaseBall(String s,boolean iB){
        super(s);
        isBouncable=iB;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            return false;
        }
        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        BaseBall otherObject = (BaseBall) obj;
        if (this.isBouncable==((BaseBall) obj).isBouncable){
            return true;
        }
        return false;
    }
}
