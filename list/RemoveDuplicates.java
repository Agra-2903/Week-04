package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        ArrayList<Integer> nonDuplicates = new ArrayList<>();

        for(int num: numbers) {
            if(!nonDuplicates.contains(num)) {
                nonDuplicates.add(num);
            }
        }

        System.out.println(nonDuplicates);
    }
}
