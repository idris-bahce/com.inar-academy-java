package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Excercise6_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a integer to control if it is palindrome:");
        int integer = in.nextInt();
        if(isPalinrome(integer)){
            System.out.println(integer + " is a palindrome.");
        }else
            System.out.println(integer + " is not a palindrome.");
    }

    private static boolean isPalinrome(int number) {
        int reverse = reverse(number);
        if (number==reverse)
            return true;
        else
            return false;

    }

    public static int reverse(int number) {
        int digit = 0;
        String num = "";
        while (number>0){
            digit = number % 10;
            number /=10;
            num += digit;
        }
        int result = Integer.parseInt(num);
        return result;

    }
}
