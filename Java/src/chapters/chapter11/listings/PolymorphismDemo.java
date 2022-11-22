package chapters.chapter11.listings;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new CircleWithCustomException
                 ( "red", false,1));
         displayObject(new Rectangle
                 ("black", true,1,1));
    }
    public static void displayObject(GeometricObject object) {
         System.out.println("Created on " + object.getDateCreated() +
                 ". Color is " + object.getColor());
         }
}
