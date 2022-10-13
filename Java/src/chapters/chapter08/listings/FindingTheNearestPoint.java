package chapters.chapter08.listings;

import java.util.Scanner;

public class FindingTheNearestPoint {
    public static void main(String[] args) {
        double[][] arr = getTheArray();

        printTheNearestTwoPoints(arr);
    }

    private static void printTheNearestTwoPoints(double[][] points) {
        int p1 = 0;
        int p2 = 1;
        double minDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
        for (int i = 0; i < points.length; i++) {
            for (int j = 1 + i; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (distance < minDistance) {
                    p1 = i;
                    p2 = j;
                    minDistance = distance;
                }
            }
        }
            System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1]
                    + ") and (" + points[p2][0] + ", " + points[p2][1] + ")");

        }


    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    private static double[][] getTheArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of the points: ");
        double[][] points = new double[in.nextInt()][2];
        System.out.println("Enter the points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = in.nextDouble();
            points[i][1] = in.nextDouble();
        }
        return points;
    }
}

