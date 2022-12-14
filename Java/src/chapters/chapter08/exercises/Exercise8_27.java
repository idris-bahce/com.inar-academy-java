package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_27 {
    public static void main(String[] args) {
        double[][] arr = getTheArray();
         sortColumns(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortColumns(double[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length-1; j++) {
                for (int k = j + 1; k < m[i].length; k++) {
                    if (m[j][i] > m[k][i]) {
                        double temp = m[j][i];
                        m[j][i] = m[k][i];
                        m[k][i] = temp;
                    }
                }
            }
        }
    }
    private static double[][] getTheArray() {
        double[][] arr = new double[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3*3 array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }
}
