package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_31 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the initial deposit amount: ");
		double amount = in.nextDouble();
		System.out.println("Enter annual percentage yield:");
		double annualInterestRate = in.nextDouble();
		System.out.println("Enter maturity period (number of months): ");
		int month = in.nextInt();
		double monthlyInterestRate = annualInterestRate / 1200;
		double total = 0;
		System.out.println("Month \t CD Value");
		System.out.println("----- \t --------");

		for (int i = 1; i <= month; i++) {
			total = amount * (1 + monthlyInterestRate);
			amount = total;
			System.out.printf("\n%3d %14.2f",i,total);
		}
	}
}
