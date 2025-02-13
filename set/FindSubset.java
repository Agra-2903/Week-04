package org.example.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSubset {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        if(set1.size() >= set2.size()) {
            System.out.println("Is " + set2 + " subset of " + set1 + ": " + set1.containsAll(set2));
        }
        else {
            System.out.println("Is " + set1 + " subset of " + set2 + ": " + set2.containsAll(set1));
        }
    }
}
