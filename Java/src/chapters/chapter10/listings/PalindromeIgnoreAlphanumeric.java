package chapters.chapter10.listings;

import java.util.Scanner;

public class PalindromeIgnoreAlphanumeric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = in.nextLine();
        System.out.println("Ignoring nonalphanumeric characters, \nis " + s + " a palindrome?: " + ((isPalindrome(s)?"yes":"no")));

    }

    private static boolean isPalindrome(String s) {
        String s1 = filter(s);
        String s2 = reverse(s1);
        return s1.equalsIgnoreCase(s2);
    }

    private static String reverse(String s1) {
        StringBuilder stringBuilder = new StringBuilder(s1);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    private static String filter(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
