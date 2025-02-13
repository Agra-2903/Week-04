package org.example.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class NthElementFromEnd {
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        int n = 2;

        Iterator<Character> first = ll.iterator();
        Iterator<Character> second = ll.iterator();

        for(int i=0; i<n; i++){
            if(!first.hasNext()) {
                System.out.println("Invalid");
                return;
            }
            first.next();
        }

        while(first.hasNext()) {
            first.next();
            second.next();
        }

        System.out.println(second.next());
    }
}
