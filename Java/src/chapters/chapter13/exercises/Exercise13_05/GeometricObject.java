package chapters.chapter13.exercises.Exercise13_05;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject>{
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        dateCreated = new Date();
        color = "white";
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Created on " + dateCreated + "\n" +
                "Color is " + color + " and is it filled: " + filled + "\n"
                + "Area is: " + getArea()
                + "\nPerimeter is: " + getPerimeter();
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject object){
        if (this.getArea()>object.getArea()){
            return 1;
        } else if (this.getArea() < object.getArea()) {
            return -1;
        }else {
            return 0;
        }
    }
    public static GeometricObject max(GeometricObject object1, GeometricObject object2){
        if (object1.compareTo(object2) > 0){
            return object1;
        }else
            return object2;
    }
}
