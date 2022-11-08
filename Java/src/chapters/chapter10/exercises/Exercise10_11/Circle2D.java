package chapters.chapter10.exercises.Exercise10_11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0,0,1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }
    public boolean contains(double x, double y){
        double distance =Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        if (distance<=this.radius){
            return true;
        }
        return false;
    }
    public boolean contains(Circle2D circle){
        double distance =Math.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));
        if ((distance + circle.getRadius())<=this.radius){
            return true;
        }
        return false;
    }
    public boolean overlaps(Circle2D circle){
        double distance =Math.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));
        if (((this.radius + circle.getRadius()) >= distance)&&(!contains(circle))){
            return true;
        }
        return false;
    }
}
