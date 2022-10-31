package chapters.chapter09.exercises.Exercise9_13;

import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = getFromUser(input);
        Location loc = locateLargest(matrix);
        System.out.println(loc.toString());
    }

    public static Location locateLargest(double[][] m) {

        int row = -1;
        int col = -1;
        double maxValue = Double.MIN_VALUE;

        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                if (m[r][c] > maxValue) {
                    row = r;
                    col = c;
                    maxValue = m[r][c];
                }
            }
        }
        return new Location(row, col, maxValue);
    }
    public static double[][] getFromUser(Scanner input) {
        System.out.println("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int col = input.nextInt();

        double[][] m = new double[row][col];

        System.out.println("Enter array: ");
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                m[r][c] = input.nextDouble();
            }
        }

        return m;
    }
}
