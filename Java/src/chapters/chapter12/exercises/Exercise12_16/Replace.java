package chapters.chapter12.exercises.Exercise12_16;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) throws IOException {
        if(args.length != 3){
            System.out.println("Usage: java Exercise12_16 file oldString newString");
            System.exit(0);
        }
        File file = new File(args[0]);
        if (!file.exists()){
            System.out.println("File does not exist.");
            System.exit(1);
        }
        File targetFile = new File("C:\\Users\\idris\\Desktop\\Output.txt");
        if (targetFile.exists()){
            System.out.println("File already exists.");
            System.exit(2);
        }

        String s= "";
        StringBuilder sb = new StringBuilder();
        try(
                Scanner input = new Scanner(file);
                PrintWriter output = new PrintWriter(targetFile)
        ){
            while (input.hasNext()){
                s = input.nextLine();
                sb.append(s.replaceAll(args[1],args[2]));
            }
            output.print(sb);
        }
    }
}
