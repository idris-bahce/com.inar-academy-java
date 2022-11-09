package chapters.chapter10.exercises.Exercise10_04;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0,0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(MyPoint point){
        double pX = (int) (Math.pow(x - point.getX(), 2));
        double pY = (int) (Math.pow(y - point.getY(), 2));

        return Math.pow(pY+pX,0.5);
    }
    public double distance(double x, double y){
        double pX = (int) (Math.pow(this.x - x, 2));
        double pY = (int) (Math.pow(this.y - y, 2));
        return Math.sqrt(pX + pY);
    }
}
