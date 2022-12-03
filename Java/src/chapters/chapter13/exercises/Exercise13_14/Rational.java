package chapters.chapter13.exercises.Exercise13_14;

public class Rational extends Number implements Comparable<Rational>{
    private long[] r = new long[2];

    public Rational() {
        this(0,1);
    }
    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.r[1] = Math.abs(denominator) / gcd;
    }

    private static long gcd(long numerator, long denominator) {
        long n1 = Math.abs(numerator);
        long n2 = Math.abs(denominator);
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        return gcd;
    }
    public long getNumerator(){
        return r[0];
    }
    public long getDenominator(){
        return r[1];
    }
    public Rational add(Rational num){
        long n = r[0] * num.getDenominator() + r[1] * num.getNumerator();
        long d = r[1] * num.getDenominator();
        return new Rational(n,d);
    }
    public Rational subtract(Rational num){
        long n = r[0] * num.getDenominator() - r[1] * num.getNumerator();
        long d = r[1] * num.getDenominator();
        return new Rational(n,d);
    }
    public Rational multiply(Rational num){
        long n = r[0] * num.getNumerator();
        long d = r[1] * num.getDenominator();
        return new Rational(n,d);
    }
    public Rational divide(Rational num){
        long n = r[0] * num.getDenominator();
        long d = r[1] * num.getNumerator();
        return new Rational(n,d);
    }
    @Override
    public String toString() {
        if (r[1] == 1)
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }
    @Override
    public boolean equals(Object other) {
        if ((this.subtract((Rational)(other))).getNumerator() == 0)
            return true;
        else
            return false;
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
        return (r[0]* 1.0) / r[1];
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}
