package chapters.chapter12.listings;

import java.io.File;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception{
        File file = new File("scores.txt");
        Scanner in = new Scanner(file);

        while (in.hasNext()){
            String firstName = in.next();
            String mi = in.next();
            String lastName = in.next();
            int score = in.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }
        in.close();
    }
}
