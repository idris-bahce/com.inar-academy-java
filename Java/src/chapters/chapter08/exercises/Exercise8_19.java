package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_19 {
    public static void main(String[] args) {
        int[][] arr = getTheArray();
        printTheArray(arr);
        if (isThere4ConsequtiveInRow(arr) || isThere4ConsequtiveInCol(arr)||isThere4ConsequtiveInDiagonal(arr)) {
            System.out.println("Yes, there are.");
        } else
            System.out.println("No, there are not.");
    }

    private static boolean isThere4ConsequtiveInDiagonal(int[][] arr) {
        for (int row = 3; row < arr.length; row++) {
            int col = 0;
            int row2 = row;
            int col2 = col;
            for (int i = row; i >= 3; i--) {
                int loopController = 0;
                int k = 1;
                int l = 1;
                int trueCounter = 0;
                while (loopController < 3) {//because we are looking for 4 consecutive number and we count 0 too.
                    if (arr[row2][col2] == arr[row2 - k][col2 + l]) {
                        trueCounter++;
                        if (trueCounter == 3) {
                            return true;
                        }
                    }
                    l++;
                    k++;
                    loopController++;
                }
                row2--;
                col2++;
            }
        }
        int col = 1;
        for (int row = arr.length - 1; row >= 3; row--) {
            int row2 = arr.length-1;
            int col2 = col;
            for (int i = row; i >= 3; i--) {
                int loopController = 0;
                int k = 1;
                int l = 1;
                int trueCounter = 0;
                while (loopController < 3) {//because we are looking for 4 consecutive number and we count 0 too.
                    if (arr[row2][col2] == arr[row2 - k][col2 + l]) {
                        trueCounter++;
                        if (trueCounter == 3) {
                            return true;
                        }
                    }
                    l++;
                    k++;
                    loopController++;
                }
                row2--;
                col2++;
            }
            col++;
        }
        int secondLoopIterator = 1;
        for (int row = arr.length - 4; row >= 0; row--) {
            int row2 = row;
            int col2 = arr[0].length-1;
            for (int i = secondLoopIterator; i > 0; i--) {
                int loopController = 0;
                int k = 1;
                int l = 1;
                int trueCounter = 0;
                while (loopController < 3) {//because we are looking for 4 consecutive number and we count 0 too.
                    if (arr[row2][col2] == arr[row2 + k][col2 - l]) {
                        trueCounter++;
                        if (trueCounter == 3) {
                            return true;
                        }
                    }
                    l++;
                    k++;
                    loopController++;
                }
                row2++;
                col2--;
            }
            secondLoopIterator++;
        }
        int row = 0;
        secondLoopIterator = 0;
        for (int col3 = arr.length-1; col3 >= 3; col3--) {
            int row2 = row;
            int col2 = col3;
            for (int i = secondLoopIterator; i < 3; i++) {
                int loopController = 0;
                int k = 1;
                int l = 1;
                int trueCounter = 0;
                while (loopController < 3) {//because we are looking for 4 consecutive number and we count 0 too.
                    if (arr[row2][col2] == arr[row2 + k][col2 - l]) {
                        trueCounter++;
                        if (trueCounter == 3) {
                            return true;
                        }
                    }
                    l++;
                    k++;
                    loopController++;
                }
                row2++;
                col2--;
            }
            secondLoopIterator++;
        }
        return false;
    }

    private static boolean isThere4ConsequtiveInCol(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length - 3; j++) {
                int fourCounter = 0;
                for (int k = j + 1; k <= j + 3; k++) {
                    if (arr[j][i] == arr[k][i]) {
                        fourCounter++;
                        if (fourCounter == 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean isThere4ConsequtiveInRow(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 3; j++) {
                int fourCounter = 0;
                for (int k = j + 1; k <= j + 3; k++) {
                    if (arr[i][j] == arr[i][k]) {
                        fourCounter++;
                        if (fourCounter == 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }


    private static void printTheArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getTheArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the rows and columns: ");
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }
}
