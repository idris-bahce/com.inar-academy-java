package chapters.chapter10.listings;

import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = in.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = in.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = in.nextDouble();

        Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);

        System.out.printf("The loan was created on %s\n" +
                "The monthly payment is %.2f\n" +
                "The total payment is %.2f\n",loan.getLoanDate().toString(),loan.getMonthlyPayment(),
                loan.getTotalPayment());
    }
}
