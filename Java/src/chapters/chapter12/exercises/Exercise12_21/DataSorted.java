package chapters.chapter12.exercises.Exercise12_21;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataSorted {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\idris\\Desktop\\SortedStrings.txt");

        try {
            System.out.print("Is " + file.getAbsolutePath() + " sorted file: ");
            System.out.println(isSorted(file)?"Yes":"");
        }catch (Exception e){
            System.out.println("There is no such a file.");
        }
    }

    private static boolean isSorted(File file) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        try (
                Scanner input = new Scanner(file)
                ){
            while (input.hasNext()){
                list.add(input.next());
            }
        }
        boolean isAllTrue = false;
        int indexOfUnsorted = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareToIgnoreCase(list.get(i + 1)) < 0){
                isAllTrue = true;
            }else {
                System.out.println("Unsorted strings are " + list.get(i) + " and " + list.get(i+1));
                isAllTrue = false;
                break;
            }
        }
        return isAllTrue?true:false;
    }
}
