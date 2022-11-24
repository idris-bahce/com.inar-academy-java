package chapters.chapter12.exercises.Exercise12_14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProcessScores {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        File file = new File(s);
        if (!file.exists()){
            System.out.println("There are no such file.");
            System.exit(0);
        }
        String s1 ="";
        try (
            Scanner input = new Scanner(file);
        ){
            while (input.hasNext()){
                s1 += input.nextLine() + " ";
            }
        }
        String[] strings = s1.split(" ");
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            if (isNumeric(strings[i])) {
                sum += Integer.parseInt(strings[i]);
            }
        }
        System.out.println("Average is " + (sum / strings.length)
        + "\nSum is " + sum);
    }

    private static boolean isNumeric(String string) {
        boolean isNumeric = false;
        for (int i = 0; i < string.length(); i++) {
            if ('0'<= string.charAt(i)&&string.charAt(i)<='9'){
                isNumeric = true;
            }else {
                return false;
            }
        }
        return isNumeric?true:false;
    }
}
