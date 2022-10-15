package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 4*4 matrix: ");
        double[][] arr = getTheArray(in);
        System.out.println("The sum of the major diagonal is: " + getTheMajorDiagonal(arr));
    }

    private static double getTheMajorDiagonal(double[][] arr) {

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }

    private static double[][] getTheArray(Scanner in) {


        double[][] arr = new double[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }
}
