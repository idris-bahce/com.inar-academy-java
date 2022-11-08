package chapters.chapter10.exercises.Exercise10_11;

public class TestCircle2D {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println("Area of the circle is: " + c1.getArea()
                + "\nPerimeter of the circle is: " + c1.getPerimeter()
                + "\nResult of the c1.contains(3,3): " + c1.contains(3,3)
                + "\nResult of the c1.contains(new Circle2D(4, 5, 10.5))" + c1.contains(new Circle2D(4, 5, 10.5))
                + "\nResult of the c1.overlaps(new Circle2D(3, 5, 2.3))" + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
