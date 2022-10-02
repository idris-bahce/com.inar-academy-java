package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three points for a triangle: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        double side1 = Math.pow((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)), 0.5);
        double side2 = Math.pow((Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2)), 0.5);
        double side3 = Math.pow((Math.pow(x3 - x1, 2)) + (Math.pow(y3 - y1, 2)), 0.5);
        if (isValid(side1, side2, side3)) {
            System.out.println("Area of this triangle is: " + area(side1,side2,side3));
        } else {
            System.out.println("Invalid inputs. Please check the inputs.");
        }
    }

    /**
     * Return true if the sum of any two sides is
     * greater than the third side.
     */
    public static boolean isValid(double side1, double side2, double side3) {
        if (((side1 + side2) > side3)&&((side1 + side3) > side2)&&((side2 + side3) > side1) ){
            return true;
        } else
            return false;

    }

    /**
     * Return the area of the triangle.
     */
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        return area;
    }
}
