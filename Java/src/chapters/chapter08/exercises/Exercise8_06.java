package chapters.chapter08.exercises;
//unfinished
import java.util.Scanner;

public class Exercise8_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter matrix1: ");
        double[][] matrix1 = getTheMatrix1(in);
        System.out.println("Enter matrix2: ");
        double[][] matrix2 = getTheMatrix2(in);
        double[][] multiply = multiplyMatrix(matrix1,matrix2);
        for (int i = 0; i < multiply.length; i++) {
            for (int j = 0; j < multiply[i].length; j++) {
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] multiply = new double[3][3];
        int index = 0;
        for (int i = 0; i < multiply.length; i++) {
            for (int j = 0; j < multiply[i].length; j++) {
                for (int k = 0; k < matrix1.length; k++) {
                    for (int l = 0; l < matrix1[k].length; l++) {
                        multiply[i][j] += matrix1[k][l] * matrix2[l][k];
                    }
                }
            }
        }
        return multiply;
    }

    private static double[][] getTheMatrix2(Scanner in) {
        double[][] arr = new double[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }

    private static double[][] getTheMatrix1(Scanner in) {
        double[][] arr = new double[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }
}
