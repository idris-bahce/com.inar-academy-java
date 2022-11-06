package chapters.chapter10.exercises.Exercise10_01;

public class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time();
        printTime(time1);
        System.out.println("------------------------");
        Time time2 = new Time(555550000);
        printTime(time2);
    }

    private static void printTime(Time time) {
        System.out.println("The time is: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
    }
}
