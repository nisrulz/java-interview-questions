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
        // would output empty queue
        int val = queue.dequeue();
        System.out.println(val);

        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);


        val = queue.dequeue();
        System.out.println(val);
        val = queue.dequeue();
        System.out.println(val);
        val = queue.dequeue();
        System.out.println(val);
        val = queue.dequeue();
        System.out.println(val);
        val = queue.dequeue();
        System.out.println(val);

        // would output empty queue
        val = queue.dequeue();
        System.out.println(val);
    }
}
