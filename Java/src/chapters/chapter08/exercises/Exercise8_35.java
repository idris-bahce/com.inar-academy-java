package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_35 {
    public static void main(String[] args) {
        int[][] arr = getTheArray();
        printTheArray(arr);
    }

    private static void printTheArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static int[][] getTheArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row of the matrix: ");
        int row = in.nextInt();
        int[][] arr = new int[row][row];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*2);
            }
        }
        return arr;
    }
}
