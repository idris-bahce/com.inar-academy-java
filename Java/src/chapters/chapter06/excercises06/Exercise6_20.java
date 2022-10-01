package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string:");
        String word = in.nextLine();
        System.out.println("Number of letters of this string is: " + countLetters(word));
    }
    public static int countLetters(String s){
        int number = s.length();
        return number;
    }
}
