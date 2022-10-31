package chapters.chapter09.exercises.Exercise9_10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
        this(0, 0, 0);
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return ( getDiscriminant() > 0) ? (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a : 0;
    }
    public double getRoot2() {
        return ( b * b - 4 * a * c > 0) ? (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a : 0;
    }
}
