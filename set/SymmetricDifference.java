package org.example.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection of the set is: " + intersectionSet);

        Set<Integer> symDiff = new HashSet<>(set1);
        symDiff.addAll(set2);
        symDiff.removeAll(intersectionSet);
        System.out.println("Symmetric Difference of the set is: " + symDiff);
    }
}
