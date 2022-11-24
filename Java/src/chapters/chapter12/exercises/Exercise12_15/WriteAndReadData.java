package chapters.chapter12.exercises.Exercise12_15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WriteAndReadData {
    public static void main(String[] args) throws IOException {
        File file = new File("Exercise12_15.txt");
        if (file.exists()){
            System.out.println("It already exists.");
            System.exit(0);
        }
        fillTheFile(file);
        ArrayList<Integer> list = new ArrayList<>();
        sortedArray(file, list);
        printList(list);


    }

    private static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%3d",list.get(i));
            if ((i + 1)%10==0){
                System.out.println();
            }
        }
    }

    private static void sortedArray(File file, ArrayList<Integer> list)throws IOException {
        try(Scanner out = new Scanner(file)){
            while (out.hasNext()){
                list.add(out.nextInt());
            }
        }
        Collections.sort(list);
    }

    private static void fillTheFile(File file)throws IOException  {
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (int i = 0; i < 100; i++) {
                printWriter.print(((int) (Math.random() * 100)) + " ");
            }
        }
    }
}
