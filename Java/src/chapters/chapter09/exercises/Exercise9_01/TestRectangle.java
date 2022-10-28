package chapters.chapter09.exercises.Exercise9_01;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 40);
        System.out.println("First values:");
        System.out.println("Width: " + rectangle.width);
        System.out.println("Height: " + rectangle.height);
        System.out.println("The area: " + rectangle.getArea());
        System.out.println("The perimeter: " + rectangle.getPerimeter());

        System.out.println();

        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("Second values:");
        System.out.println("Width: " + rectangle2.width);
        System.out.println("Height: " + rectangle2.height);
        System.out.println("The area: " + rectangle2.getArea());
        System.out.println("The perimeter: " + rectangle2.getPerimeter());

    }
}
