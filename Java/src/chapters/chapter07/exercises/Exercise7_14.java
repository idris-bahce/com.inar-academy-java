package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_14 {
    public static void main(String[] args) {
        int gcd = 0;
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter five numbers to find gcd: ");
        for (int i = 0; i < 5; i++) {
            int numbers = in.nextInt();
            arr[i] = numbers;
        }
        gcd = gcd(arr);
        System.out.println("The GCD is: " + gcd);


    }

    public static int gcd(int... numbers) {
        int gcd = 0;
        int minimum = getTheMinimumIntegerOfArray(numbers);
        for (int j = 0; j <numbers.length; j++) {
            if (numbers[0] % j == 0&&numbers[1] % j == 0&&numbers[2] % j == 0&&numbers[3] % j == 0&&numbers[4] % j == 0) {
                gcd = j;
                return gcd;
            }
        }
        return gcd;
    }

    public static int getTheMinimumIntegerOfArray(int[] numbers) {
        int minimum = getTheBiggestNumberOfArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (minimum > numbers[i]) {
                minimum = numbers[i];
            }
        }
        return minimum;
    }

    public static int getTheBiggestNumberOfArray(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;

    }
}
