package com.nisrulz.github.queue;

public class Queue {

    int[] arr;
    int front = -1;
    int rear = -1;

    public Queue(int capacity) {
        arr = new int[capacity];
    }


    public int size() {
        if (rear == -1 && front == -1)
            return 0;
        else if (rear >= front)
            return rear - front + 1;
        else
            return arr.length + rear - front + 1;
    }

    public void enqeue(int data) {
        if ((rear + 1) % arr.length == front) {
            System.out.println("Queue is full");
            return;
        }

        if (size() == 0) {
            front = rear = 0;
            arr[front] = data;
        } else {
            rear = (rear + 1) % arr.length;
            arr[rear] = data;
        }

    }

    public int dequeue() {

        if (size() == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int res = arr[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % arr.length;
        }

        return res;
    }

}
