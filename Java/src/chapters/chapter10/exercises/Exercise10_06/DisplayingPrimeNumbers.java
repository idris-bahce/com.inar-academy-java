package chapters.chapter10.exercises.Exercise10_06;

import chapters.chapter10.listings.StackOfIntegers;

public class DisplayingPrimeNumbers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        int primeNumbers = 2;
        while (primeNumbers < 120) {
            if (isPrime(primeNumbers)) {
                stack.push(primeNumbers);
            }
            primeNumbers++;
        }
        printPrimeNumbers(stack);
    }

    private static void printPrimeNumbers(StackOfIntegers stack) {
        int counter = 0;
        while (!stack.empty()) {
            System.out.printf("%4d", stack.pop());
            counter++;
            if (counter % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static boolean isPrime(int primeNumbers) {
        if (primeNumbers == 2) {
            return true;
        }

        for (int divider = 2; divider <= primeNumbers / 2; divider++) {
            if (primeNumbers % divider == 0) {
                return false;
            }
        }
        return true;
    }
}
