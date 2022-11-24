package chapters.chapter12.exercises.Exercise12_13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) throws IOException {
        if (args.length!=1){
            System.out.println("Usage: java Exercise12_13 filename");
            System.exit(0);
        }
        File file = new File(args[0]);
        if (!file.exists()){
            System.out.println(args[0] + ": File does not exist.");
            System.exit(1);
        }
        String s ;
        int charCounter = 0;
        int wordCounter = 0;
        int lineCounter = 0;
        try (
                Scanner input = new Scanner(file)
                ){
            while (input.hasNext()) {
                s = input.nextLine();
                lineCounter++;
                charCounter += countCars(s);
                wordCounter += countWords(s);
            }
        }
        System.out.println(charCounter + " characters\n"
        + wordCounter + " words\n"
        + lineCounter + " lines");
    }

    private static int countWords(String s) {
        String[] strings = s.split(" ");

        return strings.length;
    }

    private static int countCars(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == ' ') && !(s.charAt(i) == '\n')) {
                count++;
            }
        }
        return count;
    }
}
