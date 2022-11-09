package chapters.chapter10.exercises.Exercise10_13;

public class TestMyRectangle2D {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("The area of the rectangular is: " + r1.getArea() +
                "\nThe perimeter of the rectangular is: " + r1.getPerimeter() +
                "\nThe result of the r1.contains(3, 3): " + r1.contains(3, 3) +
                "\nThe result of the r1.contains(new MyRectangle2D(4, 5, 10.5,3.2)): " + r1.contains(new MyRectangle2D(4, 5, 10.5,3.2))+
                "\nThe result of the r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)): " + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
    }
}
