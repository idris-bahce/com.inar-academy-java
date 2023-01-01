package Udemy.Streams;

import java.util.ArrayList;

public class InroStreams {
    public void regular(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Ayşe");
        names.add("Fatma");
        names.add("Ahmet");
        names.add("Hayriye");
        names.add("Mehmet");
        names.add("Selim");
        names.add("Ali");
        names.add("Amir");

        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).startsWith("A")){
                count++;
            }
        }
    }
}
