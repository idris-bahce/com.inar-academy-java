package weeks.week10;

import java.util.Scanner;

public class NewMethod {
    public static void fill2DArrayWithRandomValues(int[][] arr, int start, int limit) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row:");
        int row = in.nextInt();
        System.out.println("Enter the column: ");
        int col = in.nextInt();
        arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (limit - start) + start);
            }
        }

    }
}
