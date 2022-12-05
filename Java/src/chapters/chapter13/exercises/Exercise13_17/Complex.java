package chapters.chapter13.exercises.Exercise13_17;

public class Complex implements Cloneable{
    private double a;
    private double b;

    public Complex() {
        this(0,0);
    }

    public Complex(double a) {
        this(a,0);
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }
    public Complex add(Complex c){
        return new Complex(a + c.getRealPart(),b + c.getImaginaryPart());
    }
    public Complex subtract(Complex c){
        return new Complex(a - c.getRealPart(),b - c.getImaginaryPart());
    }
    public Complex multiply(Complex c){
        return new Complex(a * c.getRealPart() - b * c.getImaginaryPart(),b * c.getRealPart() + a * c.getImaginaryPart());
    }
    public Complex divide(Complex c){
        return new Complex((a * c.getRealPart() + b * c.getImaginaryPart()) / (c.getRealPart()*c.getRealPart() +
                c.getImaginaryPart() * c.getImaginaryPart()),(b * c.getRealPart() - a * c.getImaginaryPart())/(
                        c.getRealPart()*c.getRealPart() + c.getImaginaryPart() * c.getImaginaryPart()));
    }
    public double abs(){
        return Math.sqrt(a*a + b*b);
    }
    @Override
    public String toString() {
        return (b == 0) ? (a + ""):(a + " + " + b + "i");
    }
}
