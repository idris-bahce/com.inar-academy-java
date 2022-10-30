package chapters.chapter09.exercises.Exercise9_09;

public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon regularPolygon = new RegularPolygon();
        displayAreaAndPerimeter(regularPolygon);
        RegularPolygon regularPolygon1 = new RegularPolygon(6,4);
        displayAreaAndPerimeter(regularPolygon1);
        RegularPolygon regularPolygon2 = new RegularPolygon(10,4,5.6,7.8);
        displayAreaAndPerimeter(regularPolygon2);
    }

    private static void displayAreaAndPerimeter(RegularPolygon regularPolygon) {
        System.out.println("Number of the sides of polygon: " + regularPolygon.getN());
        System.out.println("Length of side is: " + regularPolygon.getSide());
        System.out.println("Coordinates of the center is: (" + regularPolygon.getX() + ", " + regularPolygon.getY() + ")");
        System.out.println("Perimeter of the given polygon is: " + regularPolygon.getPerimeter());
        System.out.println("Area of the given polygon is: " + regularPolygon.getArea());
        System.out.println("---------------------------------------------");
    }
}
