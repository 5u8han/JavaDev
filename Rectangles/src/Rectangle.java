public class Rectangle {

    private int length;
    private int width;
    private double area;

    public Rectangle() {
        this.length=0;
        this.width=0;
        this.area= 0.0;
    }

    public Rectangle(int length, int width) {
        this.length=length;
        this.width=width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;

    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

        public void calculateArea(){
        this.area = this.length*this.width;
        }

@Override
    public String toString(){
        String str = "The The dimensions of the rectangle are as follows:\nLength: "+ this.length +"\n" +
                "Width: "+this.width+"\nArea: "+ this.area;
        return str;
}



}
