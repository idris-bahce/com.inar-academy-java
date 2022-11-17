package chapters.chapter11.checkpoints;

import java.util.ArrayList;

public class CheckPoint11_31 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Denver");
        list.add("Austin");
       // list.add(new java.util.Date()); this is a string array we cannot add object
        String city = list.get(0);
        //list.set(3, "Dallas"); here we have an index which is unreachable
        //System.out.println(list.get(3)); so here we will take array index out of bound exception
    }
}
