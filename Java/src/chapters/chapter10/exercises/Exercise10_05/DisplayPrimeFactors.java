package chapters.chapter10.exercises.Exercise10_05;

import java.util.Scanner;

public class DisplayPrimeFactors {
    public static void main(String[] args) {
        int number = getTheNumber();
        stackOfIntegers stack = new stackOfIntegers();
        fillTheStackArray(stack, number);
        while (!stack.empty()){
            System.out.println(stack.pop());
        }

    }

    private static void fillTheStackArray(stackOfIntegers stack, int number) {
        int dividers = 2;
        while (number != 1) {
            if ((number % dividers == 0) && (isDividerPrime(dividers))) {
                stack.push(dividers);
                number = number / dividers;
            }else {
                dividers++;
            }
        }
    }

    private static boolean isDividerPrime(int dividers) {
        if (dividers == 2) {
            return true;
        }
        for (int i = 2; i < dividers / 2; i++) {
            if (dividers % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int getTheNumber() {
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        return in.nextInt();

    }
}
