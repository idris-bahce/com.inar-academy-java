package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side's length: ");
        double side = in.nextDouble();
        System.out.println("Area of this polygon is: " + area(side));
    }

    public static double area(double side) {
        double area = (5 * side * side)/(4 * Math.tan(Math.PI/5));
        return area;
    }
}
