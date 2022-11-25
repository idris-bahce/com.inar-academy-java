package chapters.chapter12.exercises.Exercise12_32;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Rank {
    public static void main(String[] args) throws IOException {
        int years = 2001;
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Year     Rank1      Rank2     rank3     rank4     rank5    Rank1      Rank2     rank3     rank4     rank5 ");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        while (years < 2011) {
            File file = new File("C:\\Users\\idris\\Desktop\\babies\\" + years + ".txt");
            String[] strings;
            System.out.print(years);
            try (Scanner input = new Scanner(file)) {
                int counter = 0;
                while (input.hasNext()) {
                    strings = input.nextLine().split("\\s");
                    System.out.printf("%10s",strings[2]);
                    counter++;
                    if (counter == 5){
                        break;
                    }
                }
            }
            try (Scanner input = new Scanner(file)) {
                int counter = 0;
                while (input.hasNext()) {
                    strings = input.nextLine().split("\\s");
                    System.out.printf("%10s",strings[1]);
                    counter++;
                    if (counter == 5){
                        break;
                    }
                }
            }
            System.out.println();
            years++;
        }
    }
}
