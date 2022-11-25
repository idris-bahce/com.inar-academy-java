package chapters.chapter12.exercises.Exercise12_31;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FindName {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = in.nextInt();
        System.out.print("\nEnter the gender: ");
        char gender = in.next().toUpperCase().charAt(0);
        System.out.print("\nEnter the name: ");
        String name = in.next();

        findTheRank(year,name,gender);
    }

    private static void findTheRank(int year, String name,char gender) throws IOException {
        File file = new File("C:\\Users\\idris\\Desktop\\" + year +".txt");
        if (!file.exists()) {
            System.out.println("There isn't any file!");
            System.exit(1);
        }
        int rank = -1;
        String[] strings;
        try(Scanner input = new Scanner(file)){
            while (input.hasNext()){
                strings = input.nextLine().split("\\s");
                if (gender=='M'){
                    if (strings[1].equalsIgnoreCase(name)){
                        rank = Integer.parseInt(strings[0]);
                        break;
                    }
                }else {
                    if (strings[2].equalsIgnoreCase(name)){
                        rank = Integer.parseInt(strings[0]);
                        break;
                    }
                }
            }
        }
        System.out.println(name + " is ranked #" + rank + " in year " + year);
    }
}
