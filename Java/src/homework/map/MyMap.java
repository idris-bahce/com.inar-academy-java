package homework.map;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a","aaa");
        map.put("b","aaa");

        if (!(map.containsKey("a") && map.containsKey("b"))){
            if (map.containsKey("a")){
                map.put("b",map.get("a"));
            } else {
                map.put("a",map.get("b"));
            }
        }
    }
}
