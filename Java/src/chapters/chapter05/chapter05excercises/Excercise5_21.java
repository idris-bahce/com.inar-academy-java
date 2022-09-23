package chapters.chapter05.chapter05excercises;

import java.util.Scanner;

public class Excercise5_21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the loan amount: ");
		double amount = in.nextDouble();
		System.out.println("Enter the number of the year:");
		int year = in.nextInt();
		System.out.println("Interest Rate \t    Monthly Payment \t Total Payment");
		System.out.println("------------- \t    --------------- \t -------------");
		String percent ="%";
		double interestRate=5.0;

		while(interestRate <= 8.0) {
			double montlyInterestRate = interestRate /1200;
			double montlyPayment = amount * montlyInterestRate / (1 - (1/Math.pow(1 + montlyInterestRate, year * 12)));
			double totalPayment = montlyPayment * year * 12;
			System.out.printf("%6.3f %s %21.2f %21.2f", interestRate,percent, montlyPayment, totalPayment);
			System.out.println();
			interestRate+=0.125;
		}
	}

}
