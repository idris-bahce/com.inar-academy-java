package chapters.chapter12.exercises.Exercise12_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RemovePackageName {
    public static void main(String[] args) throws FileNotFoundException{
        if (args.length != 1){
            System.out.println("Usage: java AddPackageName srcRootDirectory");
            System.exit(0);
        }
        File file = new File("C:\\Users\\idris\\Desktop\\Directory");
        if (!file.exists()){
            System.out.println("File does not exist.");
            System.exit(1);
        }
        if (!file.isDirectory()){
            System.out.println("This is not a directory.");
            System.exit(2);
        }
        File[] files = file.listFiles();
        if (files == null){
            System.out.println("Directory is empty!");
            System.exit(3);
        }
        ArrayList<File> exercises = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory() && files[i].getName().contains("Exercise")){
                exercises.add(files[i]);
            }
        }
        for (File i : exercises ) {
            File[] thingsInExercises = i.listFiles();
            for (int j = 0; j < thingsInExercises.length; j++) {
                if (thingsInExercises[j].isFile() && thingsInExercises[j].getName().contains(".java")){
                    removeFirstLine(thingsInExercises[j]);
                }
            }
        }
    }

    private static void removeFirstLine(File file) throws FileNotFoundException {
        String s = "";
        try (
                Scanner input = new Scanner(file);
        ) {
            input.nextLine();
            input.nextLine();
            while (input.hasNext()) {
                s += input.nextLine() + "\n";
            }

            try (
                    PrintWriter output = new PrintWriter(file);
            ) {
                output.print(s);
            }
        }
    }
}
