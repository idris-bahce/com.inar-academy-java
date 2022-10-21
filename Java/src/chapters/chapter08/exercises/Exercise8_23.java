package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_23 {
    public static void main(String[] args) {
        int[][] arr = getTheArray();
        int flippedRow = getTheFlippedRow(arr);
        int flippedCol = getTheFlippedCol(arr);
        System.out.println("The flipped cell is at (" + flippedRow +", " + flippedCol +")");
    }

    private static int getTheFlippedCol(int[][] arr) {
        int oneCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j][i]==1){
                    oneCounter++;
                }
            }
            if (oneCounter%2!=0){
                return i;
            }
        }
        return -1;
    }

    private static int getTheFlippedRow(int[][] arr) {
        int oneCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==1){
                    oneCounter++;
                }
            }
            if (oneCounter%2!=0){
                return i;
            }
        }
        return -1;
    }

    private static int[][] getTheArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the matrix:");
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        return arr;
    }
}
