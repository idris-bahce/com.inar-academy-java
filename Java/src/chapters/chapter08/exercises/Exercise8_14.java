package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_14 {
    public static void main(String[] args) {
        int[][] arr = getTheArray();
        printTheMatrix(arr);
        printTheSameNumbersInRows(arr);
        printTheSameNumbersInColumns(arr);
        printTheSameNumbersInMajorDiagonal(arr);
        printTheSameNumbersInSubDiagonal(arr);

    }

    private static void printTheSameNumbersInSubDiagonal(int[][] arr) {
        boolean isAllSame = false;
        boolean[] subDiagonal = new boolean[arr.length - 1];
        int index = 1;
        int indexOfSub = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[0][arr.length - 1] == arr[index][i]) {
                isAllSame = true;
            } else {
                isAllSame = false;
                break;
            }
            subDiagonal[indexOfSub] = isAllSame;
            indexOfSub++;
            index++;
        }
        int counter = 0;
        for (int i = 0; i < subDiagonal.length; i++) {
            if (subDiagonal[i]) {
                counter++;
                if (counter == subDiagonal.length) {
                    System.out.println("All " + arr[0][arr.length - 1] + " is on sub-diagonal ");
                }
            } else {
                counter = 0;
                break;
            }
        }
        if (counter < 1) {
            System.out.println("No same numbers on sub-diagonal.");

        }
    }

    private static void printTheSameNumbersInMajorDiagonal(int[][] arr) {
        boolean isAllSame = false;
        boolean[] majorDiagonal = new boolean[arr.length-1];
        int indexOfMaj = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[0][0] == arr[i][i]) {
                isAllSame = true;
            } else {
                isAllSame = false;
                break;
            }
            majorDiagonal[indexOfMaj] = isAllSame;
            indexOfMaj++;
        }
        int counter = 0;
        for (int i = 0; i < majorDiagonal.length; i++) {
            if (majorDiagonal[i]) {
                counter++;
                if (counter == majorDiagonal.length) {
                    System.out.println("All " + arr[0][0] + " is on major diagonal ");
                }
            } else {
                counter = 0;
                break;
            }
        }
        if (counter < 1) {
            System.out.println("No same numbers on major diagonal.");

        }
    }

    private static void printTheSameNumbersInColumns(int[][] arr) {
        boolean isAllSame = false;
        boolean[] cols = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[0][i] == arr[j][i]) {
                    isAllSame = true;
                } else {
                    isAllSame = false;
                    break;
                }
            }
            cols[i] = isAllSame;
        }
        int counter = 0;
        for (int i = 0; i < cols.length; i++) {
            if (cols[i]) {
                System.out.println("All " + arr[0][i] + " is on column " + (i + 1));
                counter++;
            }
        }
        if (counter < 1) {
            System.out.println("No same numbers on a column.");
        }
    }


    private static void printTheSameNumbersInRows(int[][] arr) {
        boolean isAllSame = false;
        boolean[] rows = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][0] == arr[i][j]) {
                    isAllSame = true;
                } else {
                    isAllSame = false;
                    break;
                }
            }
            rows[i] = isAllSame;
        }
        int counter = 0;
        for (int i = 0; i < rows.length; i++) {
            if (rows[i]) {
                System.out.println("All " + arr[i][0] + " is on row " + (i + 1));
                counter++;
            }
        }
        if (counter < 1) {
            System.out.println("No same numbers on a row.");
        }
    }

    private static void printTheMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] getTheArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size for matrix: ");
        int size = in.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }
        }
        return arr;
    }
}
