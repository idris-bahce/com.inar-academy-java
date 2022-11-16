package chapters.chapter11.listings;

public class CastingDemo {
    public static void main(String[] args) {
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1,1);

        displayObject(object1);
        displayObject(object2);
    }

    private static void displayObject(Object object) {
        if(object instanceof Circle){
            System.out.println("The circle area is " + ((Circle)object).getArea()
            +  "\nThe circle diameter is " + ((Circle)object).getDiameter());
        } else if (object instanceof Rectangle) {
            System.out.println("The area of the rectangle is " + ((Rectangle) object).getArea());
        }
    }
}
