package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_25 {
    public static void main(String[] args) {
        double[][] arr = getTheArray();
        if (isMarkovMatrix(arr)){
            System.out.println("It is a Markov matrix");
        }else
            System.out.println("It is not a Markov matrix");
    }

    public static boolean isMarkovMatrix(double[][] arr) {
        if (!isAllElementsValid(arr)) {
            return false;
        } else if (!isAllElementsSumOfColumnOne(arr)) {
            return false;
        }else
            return true;
    }

    private static boolean isAllElementsSumOfColumnOne(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            double sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[j][i];
            }
            if (sum!=1){
                return false;
            }
        }
        return true;
    }

    private static boolean isAllElementsValid(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static double[][] getTheArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3*3 matrix: ");
        double[][] arr = new double[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }
}
