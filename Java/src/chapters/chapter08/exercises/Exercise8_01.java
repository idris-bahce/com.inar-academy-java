package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] arr = getTheArray(in);
        for (int i = 0; i < arr[0].length; i++) {//since we know every row have same length
            System.out.println("Sum of the elements at column" + i + " is " + sumColumn(arr, i));
        }
    }

    private static double sumColumn(double[][] arr, int i) {

        double sum = 0;
            for (int row = 0; row < arr.length; row++) {
                sum += arr[row][i];
            }

        return sum;
    }

    private static double[][] getTheArray(Scanner in) {

        double[][] arr = new double[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }
}
