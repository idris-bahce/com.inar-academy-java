package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = input.nextInt();
        int currentYear = year % 12;
        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.println("Current year is: " + zodiac[currentYear]);

    }
}
