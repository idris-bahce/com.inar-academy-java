package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of investment:");
        double investment = in.nextDouble();
        System.out.println("Enter the monthly interest rate:");
        double monthlyInterestRate = in.nextDouble();
        System.out.println("Enter the years:");
        int years = in.nextInt();
        System.out.println(futureInvestmentValue(investment, monthlyInterestRate, years));
        years(investment, monthlyInterestRate, years);
    }

    public static void years(double investment, double monthlyInterestRate, int years) {
        System.out.println("Years \t\t Future Value");
        for (int i = 1; i <= years; i++) {
            System.out.printf("%2d %18.2f",i, futureInvestmentValue(investment, monthlyInterestRate, i));
            System.out.println();
        }

    }

    public static double futureInvestmentValue(double investment, double monthlyInterestRate, double years) {

        double futureInvestmentValue = investment * Math.pow((1 + monthlyInterestRate/1200), years * 12);
        return futureInvestmentValue;
    }
}
