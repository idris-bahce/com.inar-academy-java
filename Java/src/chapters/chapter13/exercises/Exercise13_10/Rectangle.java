package chapters.chapter13.exercises.Exercise13_10;

import chapters.chapter13.listings.GeometricObject;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public int compareTo(Rectangle o) {
        if (this.getArea() > o.getArea()){
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        }else
            return 0;
    }
    @Override
    public boolean equals(Object o){
        return this.getArea() == ((Rectangle)o).getArea();
    }
}
