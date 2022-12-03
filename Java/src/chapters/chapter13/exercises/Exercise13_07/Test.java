package chapters.chapter13.exercises.Exercise13_07;

import chapters.chapter13.exercises.Exercise13_05.Circle;
import chapters.chapter13.exercises.Exercise13_05.GeometricObject;
import chapters.chapter13.exercises.Exercise13_05.Rectangle;

public class Test {
    public static void main(String[] args) {

        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Circle(7.8);
        objects[1] = new Rectangle(4, 6);
        objects[2] = new Rectangle(12, 17);
        objects[3] = new Square(5);
        objects[4] = new Square(7);

        display(objects);
    }

    public static void display(GeometricObject[] objects){
        for (GeometricObject object : objects) {
            System.out.println(object.toString() + " Area: " + object.getArea());
            if (object instanceof Colorable) {
                Colorable o = (Colorable) object;
                o.howToColor();
            }
            System.out.println();
        }
    }
}
