package chapters.chapter09.checkpoints;

public class CheckPoint9_22 {
    private double radius = 1;
    /** Find the area of this circle */
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public static void main(String[] args) {
        CheckPoint9_22 myCircle = new CheckPoint9_22();
        System.out.println("Radius is " + myCircle.radius);
    }//Not a problem. Though radius is private, myCircle.radius is used inside the Circle class. Thus, it is fine.
}
