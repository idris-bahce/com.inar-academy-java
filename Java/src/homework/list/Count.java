package homework.list;

import java.util.ArrayList;

public class Count {
    public static void main(String[] args) {
        ArrayList<Integer> randomList = getList();
        ArrayList<Integer> count = fillTheArray();
        countTheRandomList(count,randomList);
        System.out.println(count);
    }

    private static ArrayList<Integer> fillTheArray() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(0);
        }
        return list;
    }

    private static void countTheRandomList(ArrayList<Integer> count, ArrayList<Integer> randomList) {
        for (int i = 0; i < randomList.size(); i++) {
            count.set(randomList.get(i),count.get(randomList.get(i)) + 1);
        }
    }

    private static ArrayList<Integer> getList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 10));
        }
        return list;
    }
}
