package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three points for p0, p1, and p2:");
        double x0 = in.nextDouble();
        double y0 = in.nextDouble();
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        if (leftOfTheLine(x0,y0,x1,y1,x2,y2)){
            System.out.println("(" + x2 + ", "+y2+") is on the left side of the line from (" + x0 + ", " + y0+") to " +
                    "(" + x2 + ", " + y2 + ")");
        } else if (onTheSameLine(x0,y0,x1,y1,x2,y2)) {
            System.out.println("(" + x2 + ", "+y2+") is on the same line from (" + x0 + ", " + y0+") to " +
                    "(" + x2 + ", " + y2 + ")");
        } else if (rightOfTheLine(x0,y0,x1,y1,x2,y2)) {
            System.out.println("(" + x2 + ", "+y2+") is on the right side of the line from (" + x0 + ", " + y0+") to " +
                    "(" + x2 + ", " + y2 + ")");
        }
    }
    /** Return true if point (x2, y2) is on the left side of the
     * directed line from (x0, y0) to (x1, y1) */
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double p2 = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        if (p2>0) {
            return true;
        }else
            return false;
    }
    /** Return true if point (x2, y2) is on the same
     * line from (x0, y0) to (x1, y1) */
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double p2 = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        if (p2==0) {
            return true;
        }else
            return false;
    }
    /** Return true if point (x2, y2) is on the
     * line segment from (x0, y0) to (x1, y1) */
    public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double p2 = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        if (p2<0) {
            return true;
        }else
            return false;
    }
}
