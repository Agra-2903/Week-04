package org.example.Map;

import java.util.HashMap;
import java.util.Map;

public class KeyHighestValue {

    public static String findKey(Map<String, Integer> map) {
        int max = 0;
        String key = "";

        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }

        return key;
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // A=10, B=20, C=15
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String key = findKey(map);

        System.out.println(key);
    }
}
