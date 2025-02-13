package org.example.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseList {

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> al) {
        ArrayList<Integer> revAl = new ArrayList<>();

        for(int i=al.size() - 1; i>=0; i--) {
            revAl.add(al.get(i));
        }

        return revAl;
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ll) {
        LinkedList<Integer> revLl = new LinkedList<>();

        for(int i=ll.size() - 1; i>=0; i--) {
            revLl.add(ll.get(i));
        }

        return revLl;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        for(int i: arr){
            al.add(i);
            ll.add(i);
        }

        ArrayList<Integer> revAl = reverseArrayList(al);
        LinkedList<Integer> revLl = reverseLinkedList(ll);

        System.out.println(revAl);
        System.out.println(revLl);
    }
}
