package chapters.chapter06.excercises06;

import chapters.chapter06.listings06.PrintCalender;

public class Exercise6_24 {
    public static void main(String[] args) {
        getTime();
    }
    public static void getTime(){
        long totalSeconds = System.currentTimeMillis() / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;

        System.out.println(currentHour + 3 + " : " +currentMinutes + " : " + currentSeconds);
    }


}
