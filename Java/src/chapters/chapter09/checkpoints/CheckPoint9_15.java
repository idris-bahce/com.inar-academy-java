package chapters.chapter09.checkpoints;

import javafx.geometry.Point2D;

public class CheckPoint9_15 {
    public static void main(String[] args) {
        double x1 = 5.5;
        double y1 = 3.3;
        Point2D p1 = new Point2D(x1,y1);
        double x2 = 1.5;
        double y2 = 2.3;
        Point2D p2 = new Point2D(x2,y2);
        System.out.println("Distance is: " + p1.distance(p2));
    }
}
