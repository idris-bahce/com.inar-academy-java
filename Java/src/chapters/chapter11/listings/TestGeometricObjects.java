package chapters.chapter11.listings;

public class TestGeometricObjects {
    public static void main(String[] args) {
        CircleWithCustomException circle = new CircleWithCustomException(1);
        circle.printCircle();
        System.out.println("The area is: " + circle.getArea());
        System.out.println("The perimeter is: " + circle.getPerimeter());
        System.out.println("The diameter is: " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString()
        + "The area is " + rectangle.getArea()
        + "\nThe perimeter is " + rectangle.getPerimeter());
    }
}
