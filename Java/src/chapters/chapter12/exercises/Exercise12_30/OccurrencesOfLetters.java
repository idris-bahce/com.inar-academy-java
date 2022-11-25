package chapters.chapter12.exercises.Exercise12_30;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OccurrencesOfLetters {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\idris\\Desktop\\Lincoln.txt");
        ArrayList<String > list = new ArrayList<>();
        try (
                Scanner input = new Scanner(file)
        ){
            while (input.hasNext()){
                list.add(input.nextLine());
            }
        }
        occurrences(list);
    }

    private static void occurrences(ArrayList<String> list) {
        int[] alphabet = new int[26];//Size of alphabet
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            countOccurrences(s.toUpperCase(),alphabet);
        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println("Number of " + ((char)(i + 65)) + "'s: " + alphabet[i]);
        }
    }

    private static void countOccurrences(String s, int[] alphabet) {
        for (int i = 0; i < s.length(); i++) {
            if ('A'<=s.charAt(i)&&s.charAt(i)<='Z'){
                alphabet[s.charAt(i) - 'A']++;
            }
        }
    }
}
