package com.nisrulz.github.queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        // would output empty queue
        int val = queue.dequeue();
        System.out.println(val);

        queue.enqeue(5);
        queue.enqeue(4);
        queue.enqeue(3);
        queue.enqeue(2);
        queue.enqeue(1);

        // would output, queue is full
        queue.enqeue(0);


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
