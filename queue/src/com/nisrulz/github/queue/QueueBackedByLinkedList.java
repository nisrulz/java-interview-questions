package com.nisrulz.github.queue;

public class QueueBackedByLinkedList implements Queue {

    Node front = null;
    Node rear = null;


    @Override
    public int size() {
        return 0;
    }

    @Override
    public void enqueue(int data) {
        Node newNode = new Node(data);

        // If queue is empty, then new node is front and rear both
        if (rear == null) {
            front = rear = newNode;
            return;
        }

        // Add the new node at the end of queue and change rear
        rear.next = newNode;
        rear = newNode;

    }

    @Override
    public int dequeue() {

        // If queue is empty, return -1.
        if (front == null) {
            System.out.println("QueueBackedByLinkedList is empty");
            return -1;
        }

        // Store previous front and move front one node ahead
        Node tempNode = front;
        front = front.next;

        if (front == null) {
            rear = null;

        }

        return tempNode.data;
    }


    class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
