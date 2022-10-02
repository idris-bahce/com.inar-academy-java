package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string:");
        String word = in.nextLine();
        String s = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(('A'<=ch&&ch<='Z')||('a'<=ch&&ch<='z')) {
                s = s + getNumber(ch);
            }else {
                s = s + ch;
            }
        }
        System.out.println(s);
    }

    public static int getNumber(char uppercaseLetter) {
        char ch = Character.toUpperCase(uppercaseLetter);
        if ( 'A' <= ch && ch <= 'C') {
            return 2;
        } else if ('D' <= ch && ch <= 'F') {
            return 3;
        } else if ('G' <= ch && ch <= 'I') {
            return 4;
        } else if ('J' <= ch && ch <= 'L') {
            return 5;
        } else if ('M' <= ch && ch <= 'O') {
            return 6;
        } else if ('P' <= ch && ch <= 'S') {
            return 7;
        } else if ('T' <= ch && ch <= 'V') {
            return 8;
        } else  {
            return 9;
        }
    }
}
