package chapters.chapter12.exercises.Exercise12_19;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next();
        try {
            URL url = new URL(URLString);
            Scanner input = new Scanner(url.openStream());
            int counter = 0;
            while (input.hasNext()){
                String[] strings = input.nextLine().split(" ");
                counter += strings.length;
            }
            System.out.println("There are " + counter + " words in this website.");
        }catch (MalformedURLException a){
            System.out.println("Invalid URL!");
        }catch (IOException a){
            System.out.println("Input Error!");
        }
    }
}
