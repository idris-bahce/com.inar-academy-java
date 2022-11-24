package chapters.chapter12.exercises.Exercise12_17;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        File file = new File("C:\\Users\\idris\\workspace\\com.inar-academy-java\\Java\\src\\chapters\\chapter12\\" +
                "exercises\\Exercise12_17\\hangman.txt");

        do {
            ArrayList<String> words;
            try(Scanner input = new Scanner(file)){
                words = getTheWordList(input);
            }
            String word = getTheWord(words);
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
        question[changingCharacterIndex] = ch;
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

    private static String getTheWord(ArrayList words) {
        int random = (int) (Math.random() * words.size());
        return (String) words.get(random);
    }

    public static char[] getTheRandomWord(String word) {
        char[] question = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            question[i] = '*';
        }
        return question;
    }

    private static ArrayList<String> getTheWordList(Scanner input) {
        ArrayList<String> arr = new ArrayList<>();
        while (input.hasNext()){
            arr.add(input.next());
        }

        return arr;
    }
}
