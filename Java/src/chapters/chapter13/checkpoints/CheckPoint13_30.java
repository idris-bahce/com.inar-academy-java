package chapters.chapter13.checkpoints;

import chapters.chapter13.listings.Rational;

public class CheckPoint13_30 {
    public static void main(String[] args) {
        Rational r1 = new Rational(-2, 6);
        System.out.println(r1.getNumerator());
        System.out.println(r1.getDenominator());
        System.out.println(r1.intValue());
        System.out.println(r1.doubleValue());
    }
}
