package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_30 {
    public static void main(String[] args) {
        double[][] arr = getTheArray();
        double[] xandy = linearEquation(arr);
        if (xandy==null) {
            System.out.println("The equation has no solution");
        }else {
            System.out.println("x is " + xandy[0] + " and y is" + xandy[1]);
        }
    }

    public static double[] linearEquation(double[][] arr) {
        double[] xandy = new double[2];
        if ((arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]) == 0) {
            return null;
        }
        xandy[0] = ((arr[2][0] * arr[1][1]) - (arr[2][1] * arr[0][1])) / ((arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]));
        xandy[1] = ((arr[2][1] * arr[0][0]) - (arr[2][0] * arr[1][0])) / ((arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]));
        return xandy;
    }

    private static double[][] getTheArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a00, a01, a10, a11, b0, and b1");
        double[][] arr = new double[3][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }
}
