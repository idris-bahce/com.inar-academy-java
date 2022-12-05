package arraylist.list;

import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        reverseList(list);
        System.out.println(list);
    }

    private static void reverseList(ArrayList<Integer> list) {
        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
        for (int i = 0,k = newList.size()-1; i < list.size();k--, i++) {
            list.set(i,newList.get(k));
        }
    }
}
