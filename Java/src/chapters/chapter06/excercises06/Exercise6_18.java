package chapters.chapter06.excercises06;

import java.util.Scanner;

public class Exercise6_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your password:");
        String passWord = in.next();
        passWord = passWord.toUpperCase();
        int numberOfCharacters = passWord.length();
        if(isCharacterMoreThanEight(numberOfCharacters)&&
                (isOnlyConsistOfLettersAndDigits(passWord)) &&(containsAtLeastTwoDigits(passWord))){
            System.out.println("Welcome!");
        }else{
            System.out.println("Invalid password. Your password must consist three conditions:");
            System.out.println("■ A password must have at least eight characters.");
            System.out.println("■ A password consists of only letters and digits.");
            System.out.println("■ A password must contain at least two digits.");
        }
    }

    private static boolean containsAtLeastTwoDigits(String s) {
        int digitCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if('0'<=ch&&ch<='9'){
                digitCounter++;
            }
        }
        if (digitCounter>=2)
            return true;
        else
            return false;
    }

    public static boolean isOnlyConsistOfLettersAndDigits(String s) {
        int numberOfCharacters = s.length();
        boolean controlCharacters = false;
        for (int i = 0; i < numberOfCharacters; i++) {
            char ch = s.charAt(i);
            if('0'<=ch&&ch<='9'){
                controlCharacters = true;
            } else if ('A'<=ch&&ch<='Z') {
                controlCharacters = true;
            } else {
                controlCharacters = false;
                break;
            }
        }
        if (controlCharacters)
            return true;
        else
            return false;
    }

    public static boolean isCharacterMoreThanEight(int ch) {
        if(ch >= 8){
            return true;
        }else
            return false;
    }
}
