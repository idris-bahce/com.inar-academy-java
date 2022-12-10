package homework.map;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","Hi");
        map.put("b","There");

        if (map.containsKey("potato")){
            map.put("fries",map.get("ice cream"));
        }
        if (map.containsKey("salad")){
            map.put("spinach",map.get("salad"));
        }
    }
}
