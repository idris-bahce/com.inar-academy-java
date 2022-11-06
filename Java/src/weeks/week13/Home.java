package weeks.week13;

public class Home {
    private double area;
    private int numberOfBathrooms;
    private int numberOfRooms;
    private boolean hasGarage;
    private double price;
    private String front;
    private int constructionDAte;

    public Home(){
        this(60,1,1,false,100_000,"north",1900);
    }

    public Home(double area, int numberOfBathrooms, int numberOfRooms, boolean hasGarage,
                double price, String front, int constructionDAte) {
        this.area = area;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfRooms = numberOfRooms;
        this.hasGarage = hasGarage;
        this.price = price;
        this.front = front;
        this.constructionDAte = constructionDAte;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public int getConstructionDAte() {
        return constructionDAte;
    }

    public void setConstructionDAte(int constructionDAte) {
        this.constructionDAte = constructionDAte;
    }
    public void print(){
        System.out.println("-----------HOME DETAILS------------");
        System.out.println("The area of the house:" + this.area);
        System.out.println("The number of the bath of the house is:" + this.numberOfBathrooms);
        System.out.println("The number of the rooms of the house is:" + this.numberOfRooms);
        System.out.println("Has the house garage?: " + (this.hasGarage?"yes":"no"));
        System.out.println("Price of the house is: " + this.price);
        System.out.println("What is front of the house: " + this.front);
        System.out.println("Construction date of the house is: " + this.constructionDAte);
        System.out.println("-------------------------------------");
    }
}