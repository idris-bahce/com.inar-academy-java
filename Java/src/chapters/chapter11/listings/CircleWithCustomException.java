package chapters.chapter11.listings;

public class CircleWithCustomException extends GeometricObject {
    private double radius;

    public CircleWithCustomException() {
    }

    public CircleWithCustomException(double radius) {
        this.radius = radius;
    }

    public CircleWithCustomException(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    public double getDiameter(){
        return 2 * radius;
    }
    public void printCircle(){
        System.out.println(toString() +
                " and the radius is " + radius);
    }
    @Override
    public String toString(){
        return super.toString() + "Radius is " + radius;
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof CircleWithCustomException){
            return radius == ((CircleWithCustomException) o).radius;
        }else {
            return this == o;
        }
    }
}
