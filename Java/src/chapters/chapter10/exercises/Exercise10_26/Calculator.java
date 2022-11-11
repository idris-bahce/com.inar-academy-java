package chapters.chapter10.exercises.Exercise10_26;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String input = getTheInput();
        char[] chars = extractCharacters(input);

    }

    private static char[] extractCharacters(String input) {
        char[] arr = new char[3];//Since there would be only one operator and two literal, 3 would be enough to keep our characters.
        for (int i = 0, k = 0; i < input.length(); i++,k++) {
            if (('0'<= input.charAt(i) && input.charAt(i) <= '9')||('+' == input.charAt(i))||('*' == input.charAt(i))||
                    ('/' == input.charAt(i))||('-' == input.charAt(i))){
                arr[k] = input.charAt(i);
            }
        }
        return null;
    }

    private static String  getTheInput() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        return input;
    }
}
