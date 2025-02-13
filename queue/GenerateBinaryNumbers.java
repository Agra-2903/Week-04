package org.example.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        int n = 10;

        for(int i=1; i<=n; i++) {
            queue.add(Integer.toBinaryString(i));
        }

        System.out.println(queue);
    }
}
