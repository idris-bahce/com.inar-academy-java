package chapters.chapter12.exercises.Exercise12_26;

import java.io.File;
import java.util.Scanner;

public class MKDIR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of directory:");
        String s = in.next();
        File file = new File(s);
        if (file.exists()){
            System.out.println("Directory already exists.");
            System.exit(0);
        }
        System.out.println(file.mkdir()?"Directory created successfully.":"Directory can not be created.");
    }
}
