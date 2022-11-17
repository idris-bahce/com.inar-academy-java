package chapters.chapter11.checkpoints;

import java.util.ArrayList;

public class CheckPoint11_33 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);//Because here we take index
        System.out.println(list);
    }
}
