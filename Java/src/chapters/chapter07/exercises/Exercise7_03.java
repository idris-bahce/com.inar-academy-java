package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer between 1 and 100: ");
        int numbers = in.nextInt();
        if(numbers<1 || numbers>99){
            System.out.println("Invalid input!!!");
        }
        int counter = 1;
        int firstElementOfArray = numbers;
        while (numbers != 0){
            numbers = in.nextInt();
            counter++;
        }
        int[] arr = new int[counter];

    }
}
