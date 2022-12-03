package chapters.chapter13.exercises.Exercise13_15;

import java.math.BigInteger;

public class RationalWithBigInteger extends Number implements Comparable<RationalWithBigInteger>{
    private BigInteger numerator;
    private BigInteger denominator;

    public RationalWithBigInteger() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    public RationalWithBigInteger(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        this.numerator = ((denominator.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE : BigInteger.valueOf(-1)).multiply(numerator).divide( gcd);
        this.denominator = denominator.divide(gcd);
    }

    private static BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger n1 = n;
        BigInteger n2 = d;
        BigInteger gcd = BigInteger.ONE;

        for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; k.add(BigInteger.ONE)) {
            if (n1.remainder( k).compareTo(BigInteger.ZERO) == 0 && n2.remainder(k).compareTo(BigInteger.ZERO) == 0)
                gcd = new BigInteger(k + "");
        }

        return gcd;
    }
    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }
    public RationalWithBigInteger add(RationalWithBigInteger secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator() ).add(
                denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new RationalWithBigInteger(n, d);
    }

    public RationalWithBigInteger subtract(RationalWithBigInteger secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new RationalWithBigInteger(n, d);
    }

    public RationalWithBigInteger multiply(RationalWithBigInteger secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new RationalWithBigInteger(n, d);
    }

    public RationalWithBigInteger divide(RationalWithBigInteger secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.numerator);
        return new RationalWithBigInteger(n, d);
    }
    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE))
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }
    @Override
    public boolean equals(Object other) {
        if ((this.subtract((RationalWithBigInteger) (other))).getNumerator().equals(BigInteger.ONE))
            return true;
        else
            return false;
    }
    @Override
    public int compareTo(RationalWithBigInteger o) {
        if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
            return 1;
        else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
            return -1;
        else
            return 0;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.multiply(BigInteger.ONE).divide(denominator).doubleValue();
    }
}
