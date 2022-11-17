package chapters.chapter11.checkpoints;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckPoint11_36 {
    public static void main(String[] args) {
        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(java.util.Collections.max(arrayList));
    }
}
