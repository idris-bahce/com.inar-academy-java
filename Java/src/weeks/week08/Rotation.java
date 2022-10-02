package weeks.week08;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println("Is " + s2 + " rotation of " + s1 + " : " + isRotation(s1, s2));
    }

    public static boolean isRotation(String s1, String s2) {
        if ((s1.length() == s2.length()) && (isStringsAreSame(s1, s2))) {//here we are going to look one by one if the strings are same
            return true;
        } else
            return false;

    }

    public static boolean isStringsAreSame(String s, String s2) {
        String result = "";
        for (int j = 1; j <s.length(); j++) {
            result = "";
            for (int i = j; i < s.length(); i++) {
                result = result + s.charAt(i);
            }
            for (int i = 0; i <j ; i++) {
                result = result + s.charAt(i);
            }
            if (result.equals(s2)) {
                return true;
            }
        }
        return false;
    }
}
