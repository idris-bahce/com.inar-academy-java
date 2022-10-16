package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_07 {
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
                double distance = findTheDistance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1], points[j][2]);
                if (distance < minimumDistance) {
                    minimumDistance = distance;
                    p1 = i;
                    p2 = j;
                }
            }
        }
        System.out.println("The nearest points are: (" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2]
                + ") and (" + points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ")");
    }

    private static double findTheDistance(double x1, double y1, double z1, double x2, double y2, double z2) {

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
    }


    private static double[][] takeInput() {

        double[][] arr = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
                {5.5, 4, -0.5}};
        return arr;
    }
}
