package chapters.chapter13.exercises.Exercise13_03;

import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Number> list = getList();
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }
    public static void sort(ArrayList<Number> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).doubleValue() > list.get(j).doubleValue()){
                    Number temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
    private static ArrayList<Number> getList() {
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        return list;
    }
}
