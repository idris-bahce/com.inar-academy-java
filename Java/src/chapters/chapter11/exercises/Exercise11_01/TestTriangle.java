package chapters.chapter11.exercises.Exercise11_01;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        triangle.setColor("Blue");
        triangle.setFilled(true);
        System.out.println(triangle.toString());
    }
}
