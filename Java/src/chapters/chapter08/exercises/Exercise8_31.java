package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_31 {
    public static void main(String[] args) {
        double[][] points = getTheArray();
        double[] intersectingPoints = getIntersectingPoint(points);
        double interSectionx = ((intersectingPoints[0] * points[0][0]) -
                (intersectingPoints[1] * points[2][0]) + points[2][1] - points[0][1]) /
                (intersectingPoints[0] - intersectingPoints[1]);
        double intSectiony = (intersectingPoints[0] * (interSectionx - points[0][0]) + points[0][1] + intersectingPoints[1]
                * (interSectionx - points[2][0]) + points[2][1])/2;
        if (intersectingPoints == null) {
            System.out.println("Two lines are parallel.");
        } else {
            System.out.printf("The intersection point is: (%2.4f, %2.4f)",interSectionx, intSectiony);
        }
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[] intersect = new double[2];
        intersect[0] = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
        intersect[1] = (points[3][1] - points[2][1]) / (points[3][0] - points[2][0]);
        if (intersect[0] == intersect[1]) {
            return null;
        } else
            return intersect;
    }

    private static double[][] getTheArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter points");
        double[][] arr = new double[4][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }
}
