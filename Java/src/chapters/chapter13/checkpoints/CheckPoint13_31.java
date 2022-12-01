package chapters.chapter13.checkpoints;

import chapters.chapter13.listings.Rational;

public class CheckPoint13_31 {
    public static void main(String[] args) {
        Rational r1 = new Rational(-2, 6);
        Object r2 = new Rational(1, 45);
        System.out.println(((Rational)r2).compareTo(r1));
    }
}
