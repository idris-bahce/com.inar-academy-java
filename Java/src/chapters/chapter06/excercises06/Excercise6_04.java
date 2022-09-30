package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Excercise6_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a integer to reverse it:");
        int integer = in.nextInt();
        System.out.print("Reversed type of this integer is: ");
        reverse(integer);
    }

    public static void reverse(int number) {
        int digit = 0;
        String num = "";
        while (number>0){
            digit = number % 10;
            number /=10;
            num += digit;
        }
        System.out.println(num);
    }
}
