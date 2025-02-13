package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;

        if(list.isEmpty() || (rotateBy % list.size() == 0)) {
            System.out.println(list);
        }
        else {
            rotateBy = rotateBy % list.size();
            ArrayList<Integer> rotatedList = new ArrayList<>();
            rotatedList.addAll(list.subList(rotateBy, list.size()));
            rotatedList.addAll(list.subList(0, rotateBy));
            System.out.println(rotatedList);
        }
    }
}
