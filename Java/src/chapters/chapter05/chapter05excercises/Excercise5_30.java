package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_30 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount:");
		double amount = in.nextDouble();
		System.out.println("Enter the annual interest rate:");
		double annualInterestRate = in.nextDouble();
		System.out.println("Enter the month you want to save your money: ");
		int month = in.nextInt();
		double monthlyInterestRate = annualInterestRate / 1200;
		double total = 0;
		double amount1 = 0;

		for (int i = 1; i <= month; i++) {
			amount1 = amount * (1 + monthlyInterestRate);
			total += amount1;
		}
		System.out.println(total);

	}
}
