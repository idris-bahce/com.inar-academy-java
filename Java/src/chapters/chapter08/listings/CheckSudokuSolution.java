package chapters.chapter08.listings;

import java.util.Scanner;

public class CheckSudokuSolution {
    public static void main(String[] args) {
        int[][] givenSudoku = getTheSudoku();
        if (elementsAreInvalid(givenSudoku)){
            System.out.println("Invalid input.");
            System.exit(0);
        }
        if (isRowUnique(givenSudoku)&&isColumnUnique(givenSudoku)&&isLittleBoxesUnique(givenSudoku)){
            System.out.println("Valid solution.");
        }else {
            System.out.println("Invalid solution.");
        }
    }

    private static boolean isLittleBoxesUnique(int[][] givenSudoku) {
        boolean isLittleBoxesValid = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[] littleBox = new int[9];
                int index = 0;
                for (int row = i * 3; row < i * 3 + 3; row++) {
                    for (int column = j * 3; column < j * 3 + 3; column++) {
                        littleBox[index] = givenSudoku[row][column];
                        index++;
                    }
                }if (isLittleBoxValid(littleBox)){
                    isLittleBoxesValid = true;
                }else {
                    isLittleBoxesValid = false;
                    break;
                }
            }
        }
        if (isLittleBoxesValid){
            return true;
        }else
            return false;
    }

    private static boolean isLittleBoxValid(int[] littleBox) {
        java.util.Arrays.sort(littleBox);
        boolean allEqual = false;
        for (int i = 0; i < littleBox.length; i++) {
            if (littleBox[i] == 1 + i){
                allEqual = true;
            }else {
                allEqual = false;
                break;
            }
        }
        if (allEqual){
            return true;
        }else
            return false;
    }

    private static boolean elementsAreInvalid(int[][] givenSudoku) {

        for (int i = 0; i < givenSudoku.length; i++) {
            for (int j = 0; j < givenSudoku[i].length; j++) {
                if (givenSudoku[i][j]<1 || givenSudoku[i][j]>9){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isColumnUnique(int[][] givenSudoku) {

        for (int i = 0; i < givenSudoku.length - 1; i++) {
            for (int j = 1 + i; j < givenSudoku.length; j++) {
                if (givenSudoku[i][0] == givenSudoku[j][0]){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isRowUnique(int[][] givenSudoku) {

        for (int i = 0; i < givenSudoku.length - 1; i++) {
            for (int j = 1 + i; j < givenSudoku.length; j++) {
                if (givenSudoku[0][i] == givenSudoku[0][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] getTheSudoku() {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[9][9];
        System.out.println("Enter the rows of sudoku: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }
}
