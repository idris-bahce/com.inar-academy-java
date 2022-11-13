package weeks.week14;

public class Vehicles {
    protected String brand;
    protected String model;
    protected int wheels;
    protected int year;
    protected String color;
    protected boolean hasSunRoof;
    protected boolean hasInsurance;
    protected boolean running;

    public Vehicles() {
        this("default","default",4,2000,"default",false,false,false);
    }

    public Vehicles(String brand, String model, int wheels, int year, String color, boolean hasSunRoof, boolean hasInsurance,
                    boolean running) {
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
        this.year = year;
        this.color = color;
        this.hasSunRoof = hasSunRoof;
        this.hasInsurance = hasInsurance;
        this.running = running;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasSunRoof() {
        return hasSunRoof;
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }

    public boolean isHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void accelerate(){
         System.out.println((isRunning())?"Car is getting faster.":"Your car is not running.");
    }
    public void slowDown(){
        System.out.println((isRunning())?"Car is getting slowing down.":"Your car is not running.");
    }

}
