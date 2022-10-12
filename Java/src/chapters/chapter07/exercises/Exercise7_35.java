package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            String[] words = getTheWordList();
            String word = getTheWord(words);
            System.out.println("Here is your word: ");
            char[] question = getTheRandomWord(word);
            int trueCounter = 0;
            int wrongCounter = 0;
            while (trueCounter != question.length) {
                System.out.print("(Guess) Enter a letter in word ");
                printQuestion(question);
                System.out.print(">");
                char ch = in.next().charAt(0);
                if (isCharacterInOurCharacterArray(ch, word)) {
                    int changingCharacterIndex = getTheChangingCharacterIndex(ch, word);
                    displayTheChangedCharArray(changingCharacterIndex, ch, question);
                    trueCounter++;
                } else {
                    System.out.println(ch + " is not in the word.");
                    wrongCounter++;
                }
            }
            System.out.println("\nThe word is " + word + ". You missed " + wrongCounter + " time.");
            System.out.println("Do you want to guess another word? Enter y or n ");
        } while (in.next().toLowerCase().charAt(0) == 'y');
    }

    private static void printQuestion(char[] question) {
        for (int i = 0; i < question.length; i++) {
            System.out.print(question[i]);
        }
    }

    private static void displayTheChangedCharArray(int changingCharacterIndex, char ch, char[] question) {
        char temp = question[changingCharacterIndex];
        question[changingCharacterIndex] = ch;
        for (int i = 0; i < question.length; i++) {
            System.out.print(question[i]);
        }
    }

    private static int getTheChangingCharacterIndex(char ch, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isCharacterInOurCharacterArray(char ch, String word) {

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    private static String getTheWord(String[] words) {
        int random = (int) (Math.random() * 7);
        return words[random];
    }

    public static char[] getTheRandomWord(String word) {
        char[] question = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            question[i] = '*';
        }
        return question;
    }

    private static String[] getTheWordList() {

        String[] arr = {"write", "that", "word", "gun", "power", "student", "school"};
        return arr;
    }
}
