package chapters.chapter09.exercises.Exercise9_08;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    public String colour;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        colour = "blue";
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public String toString(){
        String output;
        if (isOn()){
            output = " Fan speed is: " + getSpeed() +
                    "\n Colour is: " + getColour() +
                    "\n Radius is: " + getRadius();
        }else {
            output = " Fan is off" +
                    "\n Color is " + getColour() +
                    "\n Radius is " + getRadius();
        }
        return output;
    }
}
