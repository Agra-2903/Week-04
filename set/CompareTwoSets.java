package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class CompareTwoSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(156);
        set1.add(454);
        set1.add(276);
        set1.add(324);

        set2.add(324);
        set2.add(454);
        set2.add(276);
        set2.add(156);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set1.equals(set2));
    }
}
