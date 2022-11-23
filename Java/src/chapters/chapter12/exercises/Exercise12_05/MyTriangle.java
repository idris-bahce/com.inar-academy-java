package chapters.chapter12.exercises.Exercise12_05;

public class MyTriangle {
    private double side1;
    private double side2;
    private double side3;

    public MyTriangle(){
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public MyTriangle(double side1, double side2, double side3) {
        if ((side1 + side2 <= side3)||(side1 +side3 <= side2)||(side2 + side3 <= side1)){
            throw new IllegalTriangleException("Invalid input");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * Math.abs(s - side3));
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    @Override
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3 +
                "\nThe area of the triangle is: " + this.getArea() +
                "\nThe perimeter of the triangle is: " + this.getPerimeter()
                + "\n" + super.toString();
    }
}
