package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.next();
        System.out.println("Enter a character in your string:");
        String ch1 = in.next();
        if((ch1.length()>1)||(!str.contains(ch1))){
            System.out.println("Invalid input.");
        }else {
            char ch = ch1.charAt(0);
            System.out.println(count(str,ch));
        }
    }
    public static int count(String str, char a){

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==a){
                return i + 1;
            }
        }
        return 0;
    }
}
