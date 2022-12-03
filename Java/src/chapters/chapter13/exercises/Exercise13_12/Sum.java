package chapters.chapter13.exercises.Exercise13_12;

import chapters.chapter13.listings.Circle;
import chapters.chapter13.listings.GeometricObject;
import chapters.chapter13.listings.Rectangle;

public class Sum {
    public static void main(String[] args) {
        GeometricObject[] arr = new GeometricObject[4];
        arr[0] = new Circle(3);
        arr[1] = new Circle(4);
        arr[2] = new Rectangle(4,5);
        arr[3] = new Rectangle(5,6);

        System.out.println("Sum of the areas of these objects is: " + sumArea(arr));
    }
    public static double sumArea(GeometricObject[] a){
        double sum = 0;
        for (GeometricObject o : a) {
            sum += o.getArea();
        }
        return sum;
    }
}
