package org.example.Map;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {

    public static Map<String, Integer> mergeMap(Map<String, Integer> map1, Map<String, Integer> map2) {
        for(Map.Entry<String, Integer> entry: map2.entrySet()) {
            if(map1.containsKey(entry.getKey())) {
                Integer newValue = map1.get(entry.getKey()) + entry.getValue();
                map1.put(entry.getKey(), newValue);
            }
            else {
                map1.put(entry.getKey(), entry.getValue());
            }
        }

        return map1;
    }
    public static void main(String[] args) {

        //Map1: {A=1, B=2}, Map2: {B=3, C=4}
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        map1.put("A", 1);
        map1.put("B", 2);

        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> mergedMap = mergeMap(map1, map2);

        System.out.println(mergedMap);
    }
}
