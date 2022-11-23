package chapters.chapter12.exercises.Exercise12__12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Reformat {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_12 Test.java");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " not found");
            System.exit(2);
        }
        String s = "";
        try (
                Scanner input = new Scanner(file)
        ) {

            while (input.hasNext()) {
                s += input.nextLine() + " \n";
            }
            s = s.replaceAll("\n\\s*\\{", " {");
        }
        PrintWriter output = new PrintWriter(file);
        output.println(s);
        output.close();
    }
}
