package chapters.chapter05.chapter05listings;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int number;
		int sum = 0;

		do {
			System.out.println("Enter an integer (the input ends if it is 0): ");
			number = in.nextInt();
			sum += number;
		} while (number != 0);
		System.out.println("Sum of this numbers is: " + sum);
	}

}
