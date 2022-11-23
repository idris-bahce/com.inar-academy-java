package chapters.chapter12.exercises.Exercise12_02;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        while (true) {
            try {
                System.out.println("Enter two integers: ");
                num1 = in.nextInt();
                num2 = in.nextInt();
                break;
            } catch (java.util.InputMismatchException i) {
                System.err.println("Wrong input. Please enter integers only.");
                in.next();
            }
        }

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }
}
