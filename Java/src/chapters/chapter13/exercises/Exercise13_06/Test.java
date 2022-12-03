package chapters.chapter13.exercises.Exercise13_06;

public class Test {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(12);
        ComparableCircle circle2 = new ComparableCircle(15);

        if ((circle1.compareTo(circle2)) > 0){
            System.out.println(circle1 + " is bigger.");
        }else
            System.out.println(circle2 + " is bigger.");
    }
}
