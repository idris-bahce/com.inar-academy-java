package chapters.chapter13.exercises.Exercise13_19;

import chapters.chapter13.listings.Rational;

import java.util.Scanner;

public class Fractions {
    public static void main(String[] args) {
        String[] number = getTheNumber().split("\\.");
        int numberAfterPoint = number[1].length();
        long numerator = Integer.parseInt(number[0] + number[1]);
        long denominator = (long) Math.pow(10,numberAfterPoint);
        Rational r = new Rational(numerator,denominator);
        System.out.println(r);
    }


    private static String getTheNumber() {
        System.out.println("Enter a decimal point number: ");
        Scanner in = new Scanner(System.in);
        return in.next();
    }
}
