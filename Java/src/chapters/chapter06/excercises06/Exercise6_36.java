package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n for the polygon: ");
        int n = in.nextInt();
        System.out.println("Enter the side's length: ");
        double side = in.nextDouble();
        System.out.println("Area of this polygon is: " + area(n,side));
    }

    public static double area(int n, double side) {

        double area = (n * side * side)/(4 * Math.tan(Math.PI/n));
        return area;
    }
}
