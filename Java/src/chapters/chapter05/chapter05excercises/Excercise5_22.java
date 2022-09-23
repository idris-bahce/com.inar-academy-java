package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_22 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the loan amount: ");
		double amount = in.nextDouble();
		System.out.println("Enter the number of the year:");
		int numberOfYears = in.nextInt();
		System.out.println("Enter the Annual Interest Rate: ");
		double annualRate = in.nextDouble();
		
		double monthlyInterestRate = annualRate /1200;
		double monthlyPayment = amount * monthlyInterestRate / (1 - (1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		double balance = amount;
		double principal = 0;
		
		System.out.printf("Monthly Payment: %2.2f", monthlyPayment);
		System.out.printf("\nTotal Payment: %2.2f", totalPayment);
		System.out.println();
		System.out.println("Payment# \t Interest \t Principal \t Balance");
		System.out.println("-------- \t -------- \t --------- \t -------");
		for (int i = 1; i <= numberOfYears * 12; i++) {
			annualRate = monthlyInterestRate * balance;
			principal = monthlyPayment - annualRate;
			balance = balance - principal;
			System.out.printf("%2d %20.2f %17.2f %15.2f",i, annualRate, principal, + balance);
			System.out.println();
			}
	}
}
