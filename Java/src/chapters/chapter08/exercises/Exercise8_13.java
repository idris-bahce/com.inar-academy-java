package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_13 {
    public static void main(String[] args) {
        double[][] arr = getTheArray();
        int[] arrayOfIndices = locateLargest(arr);
        System.out.println("The location of the largest element is at (" + arrayOfIndices[0] + ", " + arrayOfIndices[1] + ")");
    }

    private static double[][] getTheArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array: ");
        int row = in.nextInt();
        int col = in.nextInt();
        double[][] arr = new double[row][col];
        System.out.println("Enter the array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }

    public static int[] locateLargest(double[][] a){
        int[] arr = new int[2];
        int indexOfRow = -1;
        int indexOfCol = -1;
        double maxNum = Double.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]>maxNum){
                    maxNum = a[i][j];
                    indexOfRow = i;
                    indexOfCol = j;
                }
            }
        }
        arr[0] = indexOfRow;
        arr[1] = indexOfCol;
        return arr;
    }
}
