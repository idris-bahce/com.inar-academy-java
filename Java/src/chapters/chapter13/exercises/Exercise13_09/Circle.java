package chapters.chapter13.exercises.Exercise13_09;

import chapters.chapter13.listings.GeometricObject;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.getArea() > o.getArea()){
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        }else
            return 0;
    }
    @Override
    public boolean equals(Object o){
        return this.radius == ((Circle)o).radius;
    }
}
