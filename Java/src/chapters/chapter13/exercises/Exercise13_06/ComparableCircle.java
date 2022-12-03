package chapters.chapter13.exercises.Exercise13_06;

import chapters.chapter13.listings.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
        super(1);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "Radius: " + this.getRadius()
                + "\nArea: " + this.getArea();
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (this.getArea() > o.getArea()){
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        }else
            return 0;
    }
}
