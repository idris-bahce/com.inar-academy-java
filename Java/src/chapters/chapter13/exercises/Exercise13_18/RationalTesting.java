package chapters.chapter13.exercises.Exercise13_18;

import chapters.chapter13.exercises.Exercise13_15.RationalWithBigInteger;

import java.math.BigInteger;

public class RationalTesting {
    public static void main(String[] args) {
        RationalWithBigInteger r = new RationalWithBigInteger(BigInteger.ONE,new BigInteger(2+""));
        for (int i = 2; i < 100; i++) {
            RationalWithBigInteger secondRational = new RationalWithBigInteger(BigInteger.valueOf(i),BigInteger.valueOf(i+1));
            r = r.add(secondRational);
        }
        System.out.println(r);
    }
}
