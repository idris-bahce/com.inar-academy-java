package arraylist.list;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListTheWords {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\idris\\Desktop\\sample.txt");
        Scanner read = new Scanner(file);

        ArrayList<String> list = new ArrayList<>();
        while (read.hasNext()) {
            list.add(read.nextLine());
        }
        read.close();

        for (int i = 0; i < list.size(); i++) {
            String[] words = list.get(i).split("\\s");
            for (int j = 0; j < words.length - 1; j++) {
                for (int k = 1; k < words.length; k++) {
                    if (words[j].compareTo(words[k]) > 0) {
                        String temp = words[j];
                        words[j] = words[k];
                        words[k] = temp;
                    }

                }
            }
            for (int j = 0; j < words.length; j++) {
                System.out.print(words[j] + " ");
            }
        }
    }
}
