package weeks.week10;

import java.util.Scanner;

public class ReturnMaxRow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = in.nextInt();
        System.out.println("Enter the column:");
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        arr = fillTheArray(arr);
        printTheArray(arr);
        int maxSumOfTheRows = getTheMaxSumOfTheRows(arr);
        System.out.println("The maximum sum of the rows' is " + (maxSumOfTheRows + 1) + ". row.");
    }

    private static void printTheArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    private static int getTheMaxSumOfTheRows(int[][] arr) {

        int maxSumIndex = -1;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum>maxSum){
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        return maxSumIndex;
    }

    private static int[][] fillTheArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }
}
