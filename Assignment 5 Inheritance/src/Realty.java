public class Realty {
    private int numRooms,numBaths ;
    private double landArea;
    private String address;
    private boolean sameStructure;
    public Realty(){
        this.address=null;
        this.landArea = 0.0;
        this.numBaths=0;
        this.numRooms=0;
    }
    public Realty(int numRooms, int numBaths, double landArea, String address) {
        this.numRooms = numRooms;
        this.numBaths = numBaths;
        this.landArea = landArea;
        this.address = address;
    }
    public int getNumRooms() {
        return numRooms;
    }
    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }
    public int getNumBaths() {
        return numBaths;
    }
    public void setNumBaths(int numBaths) {
        this.numBaths = numBaths;
    }
    public double getLandArea() {
        return landArea;
    }
    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        String str = "This House Consists of "+this.numRooms+" Rooms, "
                +this.numBaths+" Bathrooms, "+this.landArea+" Land Area and is located on:  "
                +this.address;
        return str;
    }
}
