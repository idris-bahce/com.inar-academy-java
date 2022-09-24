package weeks.week06;

import java.util.Scanner;

public class StarDesign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the line: ");
        int line = in.nextInt();

        int x = 1;
        int y = line;
        for (int i = 0; i <line; i++) {
            for (int j = y; j >0; j--) {
                System.out.print("  ");
            }
            y--;
            for (int j = 0; j < x; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            x++;
            System.out.println();
        }
        int z = line;
        int k = line;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = z; j > 0; j--) {
                System.out.print("* ");
            }
            for (int j = k; j > 0 ; j--) {
                System.out.print("* ");
            }
            z--;
            k--;
            System.out.println();
        }

    }
}
