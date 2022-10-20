package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_21 {
    public static void main(String[] args) {
        double[][] arr = getTheInput();
        printTheCentralPointsAndTheMinimumTotalDistance(arr);
    }

    private static void printTheCentralPointsAndTheMinimumTotalDistance(double[][] arr) {

        double minSum = Double.MAX_VALUE;
        double distance;
        double p1 = -1;
        double p2 = -1;
        double totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                distance = findTheDistance(arr[i][0],arr[i][1],arr[j][0],arr[j][1]);
                sum += distance;
                }if (sum<minSum){
                    minSum = sum;
                    p1 = arr[i][0];
                    p2 = arr[i][1];
            }
        }
        System.out.println("The central city is at (" + p1 + ", " + p2 + ")");
        System.out.println("The total distance to all other cities is: " + minSum);
    }
    private static double findTheDistance(double x1, double y1, double x2, double y2) {

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
    private static double[][] getTheInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of the cities:");
        int num = in.nextInt();
        double[][] arr = new double[num][2];
        System.out.println("Enter the coordinates of the cities:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }
}
