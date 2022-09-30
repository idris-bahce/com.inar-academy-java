package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter line");
        int line = in.nextInt();
        displayPattern(line);
    }

    private static void displayPattern(int line) {
        int lineSpacer = line;
        int patternControler = line - (line-1);
        for (int i = 1; i <= line; i++) {
            for (int j = lineSpacer; j > 0 ; j--) {
                System.out.print("  ");
            }
            for (int j = patternControler; j>0  ; j--) {
                System.out.printf("%2d",j);
            }
            patternControler++;
            lineSpacer--;
            System.out.println();
        }
    }
}
