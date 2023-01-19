package chapter16;

import java.util.Iterator;
import java.util.PriorityQueue;

public class UsingPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>();
        queue.offer(3.65);
        queue.offer(2.5);
        queue.offer(34.774);
        queue.offer(243.64);
        System.out.println("New size is " + queue.size());

        for (Double aDouble : queue) {
            System.out.printf("%f    ", aDouble);
        }
    }
}
