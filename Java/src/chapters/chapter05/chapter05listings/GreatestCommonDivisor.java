package chapters.chapter05.chapter05listings;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int num1 = in.nextInt();
		System.out.println("Enter second integer: ");
		int num2 = in.nextInt();
		int sgcd = 1;
		int divisor = 2;

		while (divisor <= num1 && divisor <= num2) {
			if (num1 % divisor == 0 && num2 % divisor == 0) {
				sgcd=divisor;
			}
			divisor++;
		}
		System.out.println("Greatest commen divisor of this two intigers is: " + sgcd);
	}

}
