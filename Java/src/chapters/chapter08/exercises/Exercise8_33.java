package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_33 {
    public static void main(String[] args) {
        double[][] verticesPoints = getTheArray();
        double[] intersectionPoint = getTheIntersectionPoint(verticesPoints);
        double[] areas = getTheAreas(intersectionPoint,verticesPoints);
        java.util.Arrays.sort(areas);
        System.out.print("The areas are ");
        for (double a :
                areas) {
            System.out.printf("%2.2f, ",a);
        }
    }

    private static double[] getTheAreas(double[] intersectionPoint, double[][] verticesPoints) {
        double[] areas = new double[4];

        double x1 = intersectionPoint[0];
        double y1 = intersectionPoint[1];
        for (int i = 0; i < areas.length; i++) {
            double x2 = verticesPoints[i][0];
            double y2 = verticesPoints[i][1];
            double x3;
            double y3;
            if (i<3) {
                 x3 = verticesPoints[i + 1][0];
                 y3 = verticesPoints[i + 1][1];
            }else {
                 x3 = verticesPoints[0][0];
                 y3 = verticesPoints[0][1];
            }
            double side1 = Math.pow((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)), 0.5);
            double side2 = Math.pow((Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2)), 0.5);
            double side3 = Math.pow((Math.pow(x3 - x1, 2)) + (Math.pow(y3 - y1, 2)), 0.5);

            double s = (side1 + side2 + side3) / 2;
            areas[i] = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        }


        return areas;
    }

    private static double[] getTheIntersectionPoint(double[][] verticesPoints) {
        double[] intersectingPoints = new double[2];

        //0-2  and  1-3
        double a = verticesPoints[0][1] - verticesPoints[2][1];
        double b = -(verticesPoints[0][0] - verticesPoints[2][0]);
        double e = (verticesPoints[0][1] - verticesPoints[2][1]) * verticesPoints[0][0] - (verticesPoints[0][0] - verticesPoints[2][0]) * verticesPoints[0][1];
        double c = (verticesPoints[1][1] - verticesPoints[3][1]);
        double d = -(verticesPoints[1][0] - verticesPoints[3][0]);
        double f = (verticesPoints[1][1] - verticesPoints[3][1]) * verticesPoints[1][0] - (verticesPoints[1][0] - verticesPoints[3][0]) * verticesPoints[1][1];

        if (a * d - b * c == 0) {
            return intersectingPoints;
        } else {
            intersectingPoints[0] = (e * d - b * f) / (a * d - b * c);
            intersectingPoints[1] = (a * f - e * c) / (a * d - b * c);
        }

        return intersectingPoints;
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
