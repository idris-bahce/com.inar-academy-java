package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise8_12 {
    public static void main(String[] args) {


        double[] statusAndIncome = getFromUSer();

        double tax = getTax(statusAndIncome);

        displayAll(tax);

    }

    public static double[] getFromUSer() {
        Scanner input = new Scanner(System.in);

        double[] statusAndIncome = new double[2];

        System.out.println("Enter your status" +
                "(0 - Single filer, 1-Married jointly or qualifying widow(er), " +
                "2-Married separately, 3-Head of household): ");
        statusAndIncome[0] = input.nextDouble();

        System.out.println("Enter your income: ");
        statusAndIncome[1] = input.nextDouble();

        return statusAndIncome;
    }

    public static double getTax(double[] statusAndIncome) {
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950}};// Head of household

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        double tax = 0;
        int indexOfIncome = -1;

        for (int i = 0; i < brackets[0].length; i++) {
            // Finds the range of income
            if (statusAndIncome[1] > brackets[(int) (statusAndIncome[0])][i]) {
                indexOfIncome = i;
            }else{
                break;
            }
        }
        // Not less than first element in brackets
        if (indexOfIncome != -1) {
            tax += (statusAndIncome[1] - brackets[(int) (statusAndIncome[0])][indexOfIncome]) * rates[indexOfIncome + 1];
        }else {
            return statusAndIncome[1] * rates[0];
        }

        for (int i = indexOfIncome; i > 0; i--) {
            tax += (brackets[(int)(statusAndIncome[0])][i] - brackets[(int)(statusAndIncome[0])][i - 1]) * rates[i];
        }

        tax += (brackets[(int)(statusAndIncome[0])][0]  * rates[0]);

        return tax;
    }


    public static void displayAll(double tax) {

        System.out.printf("Tax is %.1f", tax);
    }
}
