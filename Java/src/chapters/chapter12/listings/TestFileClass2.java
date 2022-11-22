package chapters.chapter12.listings;

import java.io.File;

public class TestFileClass2 {
    public static void main(String[] args) {
        File file = new File("C:\\");
        listFile(file);
    }

    private static void listFile(File file) {
        System.out.println(file.getAbsoluteFile());
        if(file.isDirectory()){
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : file.listFiles()) {
                    listFile(f);
                }
            }
        }
    }
}
