package chapters.chapter05.chapter05listings;

import java.util.Scanner;

public class SentinelValue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer (the input ends if it is 0): ");
		int number = in.nextInt();
		int sum = 0;

		while (number != 0) {
			sum += number;
			System.out.println("Enter an integer (the input ends if it is 0): ");
			number = in.nextInt();
		}
		System.out.println("Sum of this numbers is: " + sum);
	}

}
