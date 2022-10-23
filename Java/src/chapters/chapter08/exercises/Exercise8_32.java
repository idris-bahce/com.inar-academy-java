package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_32 {
    public static void main(String[] args) {
        double[][] points = getTheArray();
        double area = getTriangleArea(points);
        if(area>0) {
            System.out.printf("The area of the triangle is %2.2f", area);
        }else
            System.out.println("The three points are on the same line.");
    }
    public static double getTriangleArea(double[][] points){
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];

        double side1 = Math.pow((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)), 0.5);
        double side2 = Math.pow((Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2)), 0.5);
        double side3 = Math.pow((Math.pow(x3 - x1, 2)) + (Math.pow(y3 - y1, 2)), 0.5);

        double s = (side1 + side2 + side3) / 2;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }
    private static double[][] getTheArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter points");
        double[][] arr = new double[3][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }
}
