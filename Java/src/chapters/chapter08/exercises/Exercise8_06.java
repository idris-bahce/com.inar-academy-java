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
        printMultiply(matrix1,matrix2,multiply);
    }

    private static void printMultiply(double[][] matrix1, double[][] matrix2, double[][] multiply) {
        for (int i = 0; i < multiply.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.printf("%4.1f",matrix1[i][j]);
                if (j!=matrix1[i].length -1){
                    continue;
                }
                if (i==1){
                    System.out.print("  *  ");
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
            for (int j = 0; j < multiply[i].length; j++) {
                System.out.printf("%5.1f",multiply[i][j]);
            }

            System.out.println();
        }
    }

    private static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] multiply = new double[3][3];
        int indexColumn = 0;
        int indexRow = 0;
        while(indexRow<multiply.length) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    multiply[indexRow][indexColumn] += matrix1[indexRow][j] * matrix2[j][i];
                }
                indexColumn++;
                if (indexColumn==3){
                    indexColumn=0;
                }
            }
            indexRow++;
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
