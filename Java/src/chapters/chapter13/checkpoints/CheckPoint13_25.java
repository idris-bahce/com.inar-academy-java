package chapters.chapter13.checkpoints;

import java.util.ArrayList;

public class CheckPoint13_25 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("New York");
        ArrayList<String> list1 = list;
        ArrayList<String> list2 = (ArrayList<String>)(list.clone());
        list.add("Atlanta");
        System.out.println(list == list1);
        System.out.println(list == list2);
        System.out.println("list is " + list);
        System.out.println("list1 is " + list1);
        System.out.println("list2.get(0) is " + list2.get(0));
        System.out.println("list2.size() is " + list2.size());
    }
}
