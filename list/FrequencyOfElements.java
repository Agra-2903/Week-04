package org.example.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "orange"};

        ArrayList<String> elements = new ArrayList<>();

        for(String s: arr){
            elements.add(s);
        }

        Map<String, Integer> frequency = new HashMap<>();

        for(String str: elements){
            frequency.put(str, frequency.getOrDefault(str, 0) + 1);
        }

        System.out.println(frequency);
    }
}
