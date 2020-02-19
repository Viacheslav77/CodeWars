package javaExample.main;

import java.util.HashMap;
import java.util.Map;

public class Example3 {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 2);
        map.put(1, null);
        map.put(1, 3);
        map.put(null, 3);
        System.out.println(map);
    }
}
