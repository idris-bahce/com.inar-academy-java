package chapters.chapter11.checkpoints;

import java.util.ArrayList;

public class CheckPoint11_32 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dallas");
        list.add("Dallas");
        list.add("Houston");
        list.add("Dallas");

        System.out.println(list.toString());

        while (true){
            if (!list.contains("Dallas")){
                break;
            }
            list.remove("Dallas");
        }

        System.out.println(list.toString());
    }
}
