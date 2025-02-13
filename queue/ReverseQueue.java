package org.example.queue;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> numbers = new ArrayDeque<>(Arrays.asList(400, 100, 500, 200, 300));

        System.out.println(numbers);
        reverseQueue(numbers);

        System.out.println(numbers);
    }

    public static void reverseQueue(Queue<Integer> queue) {
        if(queue.isEmpty()) {
            return;
        }

        int front = queue.remove();

        reverseQueue(queue);

//        System.out.print(front + " ");
        queue.add(front);
    }
}
