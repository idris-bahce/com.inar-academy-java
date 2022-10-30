package chapters.chapter09.exercises.Exercise9_08;

public class TestFan {
    public static void main(String[] args) {
        System.out.println("The first fan: ");
        firstFan();
        System.out.println("The second fan: ");
        secondFan();


    }

    private static void secondFan() {
        Fan fan = new Fan();
        fan.setSpeed(fan.MEDIUM);
        fan.setRadius(5);
        fan.setOn(false);
        System.out.println(fan.toString());
    }

    private static void firstFan() {
        Fan fan = new Fan();
        fan.setSpeed(fan.FAST);
        fan.setRadius(10);
        fan.setColour("yellow");
        fan.setOn(true);
        System.out.println(fan.toString());
    }
}
