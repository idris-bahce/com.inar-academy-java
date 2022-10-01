package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int n = in.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((int)(Math.random() * 2) + "  ");
                if (j % n == 0) {
                    System.out.println();
                }
            }
        }
    }


}
