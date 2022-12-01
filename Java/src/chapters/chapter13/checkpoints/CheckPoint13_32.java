package chapters.chapter13.checkpoints;

import chapters.chapter13.listings.Rational;

public class CheckPoint13_32 {
    public static void main(String[] args) {
        Object r1 = new Rational(-2, 6);
        Rational r2 = new Rational(1, 45);
        System.out.println(r2.compareTo((Rational) r1));
    }
}
