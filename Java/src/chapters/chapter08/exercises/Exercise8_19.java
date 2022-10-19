package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_19 {
    public static void main(String[] args) {
        int[][] arr = getTheArray();
        printTheArray(arr);
        if (isThere4ConsequtiveInRow(arr) || isThere4ConsequtiveInCol(arr)){//||isThere4ConsequtiveInDiagonal(arr)){
            System.out.println("Yes, there are.");
        } else
            System.out.println("No, there are not.");
    }

  //  private static boolean isThere4ConsequtiveInDiagonal(int[][] arr) {
  //      for (int i = 0; i < arr.length; i++) {
  //          for (int j = 0; j < arr[i].length; j++) {
  //
  //          }
  //      }
  //  }

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
