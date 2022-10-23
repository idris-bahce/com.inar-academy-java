package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_34 {
    public static void main(String[] args) {
        double[][] points = getTheArray();
        double[] theRightMostLowestPoint = getRightmostLowestPoint(points);
        System.out.println("The rightmost lowest point is (" + theRightMostLowestPoint[0] + "," + theRightMostLowestPoint[1] + ")");
    }
    public static double[] getRightmostLowestPoint(double[][] points){
        double[] arr = new double[2];
        double min = Double.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
                if (points[i][1]<min){
                    min = points[i][1];
            }
        }
        arr[1]=min;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < points.length; i++) {
                if (points[i][0]>max && points[i][1]==min){
                    max=points[i][0];
            }
        }
        arr[0]=max;
        return arr;
    }
    private static double[][] getTheArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter points");
        double[][] arr = new double[6][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }
}
