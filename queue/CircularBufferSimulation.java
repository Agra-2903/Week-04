package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class CircularBufferSimulation {
    private Queue<Integer> queue;
    private int capacity;

    public CircularBufferSimulation(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<>();
    }

    public void insert(int value) {
        if (queue.size() == capacity) {
            queue.poll();
        }
        queue.offer(value);
    }

    public String getBuffer() {
        return queue.toString();
    }

    public static void main(String[] args) {
        CircularBufferSimulation cb = new CircularBufferSimulation(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        System.out.println("Buffer after inserting 1, 2, 3: " + cb.getBuffer());

        cb.insert(4);
        System.out.println("Buffer after inserting 4: " + cb.getBuffer());

        cb.insert(5);
        System.out.println("Buffer after inserting 5: " + cb.getBuffer());

        cb.insert(6);
        System.out.println("Buffer after inserting 6: " + cb.getBuffer());
    }
}

