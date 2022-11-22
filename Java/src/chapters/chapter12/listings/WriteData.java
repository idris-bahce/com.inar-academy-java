package chapters.chapter12.listings;

import java.io.*;

public class WriteData {
    public static void main(String[] args) throws IOException{
        File file = new File("scores.txt");
        if (file.exists()){
            System.out.println("File already exists.");
            return;
        }
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.print("İdris BAHCE ");
        printWriter.println("90");
        printWriter.print("Havva BAHCE ");
        printWriter.println("95");

        printWriter.close();
    }
}
