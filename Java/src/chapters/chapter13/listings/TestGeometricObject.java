package chapters.chapter13.listings;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject go1 = new Circle(5);
        GeometricObject go2 = new Rectangle(5,3);

        System.out.println("The two object have the same area? " + equalArea(go1,go2));

        displayGo(go1);
        displayGo(go2);

    }

    private static void displayGo(GeometricObject go) {
        System.out.println();
        System.out.println("The area is " + go.getArea());
        System.out.println("The perimeter is " + go.getPerimeter());
    }

    private static boolean equalArea(GeometricObject go1, GeometricObject go2) {
        return go1.getArea()==go2.getArea();
    }
}
