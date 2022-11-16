package chapters.chapter11.checkpoints;

public class CheckPoint11_11 {
//this is corrected form
}
 class Circle {
 private double radius;

         public Circle(double radius) {
         radius = radius;
         }

         public double getRadius() {
         return radius;
         }

         public double getArea() {
         return radius * radius * Math.PI;
         }
 }

         class K extends Circle {
 private double length;

         K(double radius, double length) {
         super(radius);//Circle(radius)
         this.length = length;//length is not enough
         }

         @Override
    public double getArea() {
             return super.getArea() * length;//getArea() it is recursive
         }
 }