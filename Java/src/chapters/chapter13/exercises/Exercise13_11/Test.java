package chapters.chapter13.exercises.Exercise13_11;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        Octagon o = new Octagon(5);
        System.out.println("Area of the octagon: " + o.getArea());
        System.out.println("Perimeter of the octagon: " + o.getPerimeter());
        Octagon o2 = (Octagon) o.clone();

        if (o.compareTo(o2)>0){
            System.out.println("o is bigger.");
        } else if (o.compareTo(o2)<0) {
            System.out.println("o2 is bigger.");
        }else
            System.out.println("They are same.");
    }
}
