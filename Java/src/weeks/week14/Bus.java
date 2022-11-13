package weeks.week14;

public class Bus extends Vehicles{
    private int passengerSeat;

    public Bus(String mercedes, String benz, int i, int i1, boolean b, boolean b1, boolean b2, int i2) {

        this("default","default",4,2000,"default",false,false,
                false,30);

    }

    public Bus(String brand, String model, int wheels, int year, String color,
               boolean hasSunRoof, boolean hasInsurance, boolean running, int passengerSeat) {
        super(brand, model, wheels, year, color, hasSunRoof, hasInsurance, running);
        this.passengerSeat = passengerSeat;
    }

    public int getPassengerSeat() {
        return passengerSeat;
    }

    public void setPassengerSeat(int passengerSeat) {
        this.passengerSeat = passengerSeat;
    }
    @Override
    public void accelerate(){
        System.out.println((isRunning())?"Bus is getting faster.":"Your Bus is not running.");
    }
    @Override
    public void slowDown(){
        System.out.println((isRunning())?"Bus is getting slowing down.":"Your Bus is not running.");
    }
    @Override
    public String toString(){
       return ("Your vehicle's brand is: " + super.brand
        + "\nYour vehicles model is: " + model
        + "\nYour vehicle's color is: " + color);
    }
}
