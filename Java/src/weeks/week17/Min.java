package weeks.week17;

import java.util.ArrayList;
import java.util.List;

public class Min {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillTheList(list);
        System.out.println(list);
        int min = findTheMin(list);
        System.out.println("Min is: " + min);
        int index = findTheIndex(list,min);
        System.out.println("Index is: " + index);
    }

    private static int findTheIndex(List<Integer> list , int a) {
        for (int i = 0; i < list.size(); i++) {
            if (a == list.get(i)){
                return i;
            }
        }
        return -1;
    }

    private static int findTheMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (min>list.get(i)){
                min = list.get(i);
            }
        }
        return min;
    }

    private static void fillTheList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
    }
}
