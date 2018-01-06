package com.nisrulz.github.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackBackedByTwoQueues implements Stack {
    Queue<Integer> queue1, queue2;
    private int size = 0;
    int capacity;

    public StackBackedByTwoQueues(int capacity) {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
        this.capacity = capacity;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(int data) {
        // If queue1 is not full, add elements to queue1
        if (!isFull()) {
            queue1.add(data);
            size++;
        } else {
            System.out.println("StackBackedByTwoQueues is full!");
        }


    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            // Since queue is a FIFO, we need to take out all element before we can take out the last one
            // take out all element from queue1 into queue2 except the last one.
            while (queue1.size() > 1) {
                queue2.add(queue1.remove());
            }
            // now remove the last element
            int val = queue1.remove();

            // now swap queue2 and queue1
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;

            size--;
            // return the popped value
            return val;
        } else {
            System.out.println("StackBackedByTwoQueues is empty!");
            return -1;
        }
    }

    @Override
    public boolean isFull() {
        return size() >= capacity;
    }

    @Override
    public boolean isEmpty() {
        return queue1.size() == 0;
    }
}
