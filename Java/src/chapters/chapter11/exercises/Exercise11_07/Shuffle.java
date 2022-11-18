package chapters.chapter11.exercises.Exercise11_07;

import java.util.ArrayList;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
        shuffle(list);
        System.out.println(list.toString());

    }
    public static void shuffle(ArrayList<Integer> list){
        java.util.Collections.shuffle(list);
    }
}
