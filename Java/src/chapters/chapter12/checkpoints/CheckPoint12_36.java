package chapters.chapter12.checkpoints;

import java.util.Scanner;

public class CheckPoint12_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intValue = input.nextInt();
        double doubleValue = input.nextDouble();
        String line = input.nextLine();
        System.out.println(intValue + ", " + doubleValue + ", " + line);
    }
}
