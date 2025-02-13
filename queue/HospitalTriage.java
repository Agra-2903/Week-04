package org.example.queue;

import java.util.Collections;
import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.priority, other.priority);
    }


}
public class HospitalTriage {
    public static void arrangeBasedPriority(PriorityQueue<Patient> pq){
        while(!pq.isEmpty()){
            Patient p = pq.poll();
            System.out.print(p.name+" ");
            System.out.print(p.priority+" ");
            System.out.println();

        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(new Patient("John", 3));
        pq.offer(new Patient("Alice", 5));
        pq.offer(new Patient("Bob",2));
        arrangeBasedPriority(pq);

    }
}
