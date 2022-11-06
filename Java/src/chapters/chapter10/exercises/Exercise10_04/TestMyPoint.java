package chapters.chapter10.exercises.Exercise10_04;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();
        System.out.println("The distance between the points (" + myPoint1.getX() + ", " + myPoint1.getY() + ") and "
                + " (10,30.5) is :" + myPoint1.distance(10,30.5));

    }
}
