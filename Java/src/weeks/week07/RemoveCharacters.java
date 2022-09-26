package weeks.week07;

import java.util.Scanner;

public class RemoveCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String word1 = in.nextLine();
        System.out.println("Enter the second string: ");
        String word2 = in.nextLine();
        int len1 = word1.length();
        int len2 = word2.length();
        boolean write = false;
        String result = "";

        for (int i = 0; i < len1; i++) {
            char ch1 = word1.charAt(i);
            for (int j = 0; j < len2; j++) {
                char ch2 = word2.charAt(j);
                if (ch1 == ch2) {
                    write = false;
                    break;
                } else
                    write = true;
            }
            if (write) {
                result += ch1;
            }
        }
        System.out.println(result);

    }
}
