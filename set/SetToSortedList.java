package org.example.set;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(324, 276, 454, 156));

        Set<Integer> sortedSet = new TreeSet<>(set);

        List<Integer> list = new ArrayList<>(sortedSet);

        System.out.println(list);
    }
}
