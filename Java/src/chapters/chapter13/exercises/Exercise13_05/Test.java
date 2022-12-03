package chapters.chapter13.exercises.Exercise13_05;

public class Test {
    public static void main(String[] args) {

        GeometricObject r1 = new Rectangle(5, 6.8);
        GeometricObject r2 = new Rectangle(8.4, 4);

        System.out.println("The larger rectangle is: \n" + Rectangle.max(r1, r2));

        GeometricObject c1 = new Circle(10.1);
        GeometricObject c2 = new Circle(10);

        System.out.println("The larger circle is: \n" + Circle.max(c1, c2));
    }
}
