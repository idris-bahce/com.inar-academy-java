package chapters.chapter11.listings;

public class CastingDemo {
    public static void main(String[] args) {
        Object object1 = new CircleWithCustomException(1);
        Object object2 = new Rectangle(1,1);

        displayObject(object1);
        displayObject(object2);
    }

    private static void displayObject(Object object) {
        if(object instanceof CircleWithCustomException){
            System.out.println("The circle area is " + ((CircleWithCustomException)object).getArea()
            +  "\nThe circle diameter is " + ((CircleWithCustomException)object).getDiameter());
        } else if (object instanceof Rectangle) {
            System.out.println("The area of the rectangle is " + ((Rectangle) object).getArea());
        }
    }
}
