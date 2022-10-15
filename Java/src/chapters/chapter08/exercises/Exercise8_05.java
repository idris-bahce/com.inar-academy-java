package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter matrix1: ");
        double[][] matrix1 = getTheMatrix1(in);
        System.out.println("Enter matrix2: ");
        double[][] matrix2 = getTheMatrix2(in);
        double[][] sum = addMatrix(matrix1,matrix2);
        printSum(sum,matrix1,matrix2);

    }

    private static void printSum(double[][] sum,double[][] matrix1,double[][]matrix2) {

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.printf("%4.1f",matrix1[i][j]);
                if (j!=matrix1[i].length -1){
                    continue;
                }
                if (i==1){
                    System.out.print("  +  ");
                }else {
                    System.out.print("     ");
                }
            }
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.printf("%4.1f",matrix2[i][j] );
                if (j!=matrix1[i].length -1){
                    continue;
                }
                if (i==1){
                    System.out.print("  =  ");
                }else {
                    System.out.print("     ");
                }
            }
            for (int j = 0; j < sum[i].length; j++) {
                System.out.printf("%5.1f",sum[i][j]);
            }

            System.out.println();
        }
    }

    private static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {

        double[][] sum = new double[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
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
