package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter milliseconds:");
        long milliSeconds = in.nextLong();
        System.out.println(convertMillis(milliSeconds));
    }
    public static String convertMillis(long millis){
        long totalSeconds = millis / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour;
        String result = currentHour + " : " + currentMinutes + " : " + currentSeconds;
        return result;
    }
}
