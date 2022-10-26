package chapters.chapter09.listings;

public class CircleWithStaticMembers {
    double radius = 1;
    static  int numberOfObjects = 0;
    CircleWithStaticMembers(){
        radius = 1;
        numberOfObjects++;
    }
    CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }

}
