package chapters.chapter09.exercises.Exercise9_01;

public class Rectangle {

    public double width;

    public double height;

    Rectangle(){
        width = 1;
        height = 1;
    }
    Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * width + 2 * height;
    }
}
