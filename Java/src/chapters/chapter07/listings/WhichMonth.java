package chapters.chapter07.listings;

import java.util.Scanner;

public class WhichMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a day as integer:(i.e: like 0 to Sunday and 6 to Saturday)");
        int day = in.nextInt();
        if (day >= 7 || day <0) {
            System.out.println("Invalid input!!!");
        } else
            printMonth(day);
    }

    public static void printMonth(int day) {
        String[] dayName = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(dayName[day]);
    }
}
