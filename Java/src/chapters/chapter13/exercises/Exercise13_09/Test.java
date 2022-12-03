package chapters.chapter13.exercises.Exercise13_09;

public class Test {
    public static void main(String[] args) {

        Circle circle = new Circle(7.5);
        Circle circle1 = new Circle(7.5);

        System.out.println("The circles are the same?: " + circle.equals(circle1));

    }
}
