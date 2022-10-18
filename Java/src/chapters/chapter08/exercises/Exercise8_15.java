package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_15 {
    public static void main(String[] args) {
        double[][] arrayOfPoints = getThePoints();
        if(sameLine(arrayOfPoints)){
            System.out.println("The five points are on the same line.");
        }else
            System.out.println("The five points are not on the same line.");
    }

    private static boolean sameLine(double[][] arrayOfPoints) {
        double x0 = arrayOfPoints[0][0];
        double y0 = arrayOfPoints[0][1];
        double x1 = arrayOfPoints[1][0];
        double y1 = arrayOfPoints[1][1];
        double x2 = arrayOfPoints[2][0];
        double y2 = arrayOfPoints[2][1];
        double x3 = arrayOfPoints[3][0];
        double y3 = arrayOfPoints[3][1];
        double x4 = arrayOfPoints[4][0];
        double y4 = arrayOfPoints[4][1];

        double loc1 = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
        double loc2 = ((x3 - x2) * (y4 - y2)) - ((x4 - x2) * (y3 - y2));


        return (loc1 == 0 && loc2 == 0);
    }

    private static double[][] getThePoints() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter five points: ");
        double[][] arr = new double[5][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }
}
