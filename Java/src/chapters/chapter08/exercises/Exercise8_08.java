package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_08 {
    public static void main(String[] args) {
        double[][] points = takeInput();

        printTheNearestPoints(points);
    }

    private static void printTheNearestPoints(double[][] points) {
        double minimumDistance = Double.MAX_VALUE;
        int p1 = -1;//these will be our index numbers
        int p2 = -1;//these will be our index numbers
        for (int i = 0; i < points.length; i++) {
            for (int j = 1 + i; j < points.length; j++) {
                double distance = findTheDistance(points[i][0],points[i][1],points[j][0],points[j][1]);
                if (distance<minimumDistance){
                    minimumDistance = distance;
                    p1 = i;
                    p2 = j;
                }
            }
        }

        System.out.println("The nearest points are: (" + points[p1][0] + ", " + points[p1][1]
                + ") and (" + points[p2][0] + ", " + points[p2][1] + ")" );
    }

    private static double findTheDistance(double x1, double y1, double x2, double y2) {

        return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1) * (y2 - y1));
    }


    private static double[][] takeInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of the points: ");
        double[][] arr = new double[in.nextInt()][2];
        System.out.println("Enter the points:(first x, then y)");
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = in.nextDouble();
            arr[i][1] = in.nextDouble();
        }
        return arr;
    }
}
