package chapters.chapter13.checkpoints;

import chapters.chapter13.listings.Rational;

public class CheckPoint13_34 {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, -2);
        System.out.println(r1.add(r2));
    }
}
