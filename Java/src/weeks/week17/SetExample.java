package weeks.week17;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fill(list);
        System.out.println(list);
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        System.out.println(Arrays.toString(set.toArray()));
    }

    private static void fill(List<Integer> list) {
        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 19));
        }
    }
}
