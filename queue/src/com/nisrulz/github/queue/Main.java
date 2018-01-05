package com.nisrulz.github.queue;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n>> QueueBackedByArray:");
        QueueBackedByArray queueBackedByArray = new QueueBackedByArray(5);
        operateOnQueue(queueBackedByArray);

        System.out.println("\n>> QueueBackedByLinkedList:");
        QueueBackedByLinkedList queueBackedByLinkedList = new QueueBackedByLinkedList();
        operateOnQueue(queueBackedByLinkedList);
    }


    private static void operateOnQueue(Queue queue) {
        // Initially the queue is empty, so attempting to dequeue now should output empty queue
        int val = queue.dequeue();

        // add value to queue
        System.out.println("\n> Adding values to queue\n");
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
            // get size of queue
            System.out.println("Value added " + i + ", Size of Queue: " + queue.size());
        }


        // remove value from queue
        System.out.println("\n> Removing values from queue\n");
        for (int i = 0; i < 7; i++) {
            val = queue.dequeue();
            System.out.println("Value removed " + val + ", Size of Queue: " + queue.size());
        }
    }
}
