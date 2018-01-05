package com.nisrulz.github.queue;

public class QueueBackedByLinkedList implements Queue {

    class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front = null;
    private Node rear = null;
    private int size = 1;

    private int capacity;

    public QueueBackedByLinkedList(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enqueue(int data) {
        if (size() >= capacity) {
            System.out.println("QueueBackedByLinkedList is full!");
        } else {
            Node newNode = new Node(data);

            // If queue is empty, then new node is front and rear both
            if (rear == null) {
                front = rear = newNode;
                return;
            }

            // Add the new node at the end of queue and change rear
            rear.next = newNode;
            rear = newNode;
            size++;
        }
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
        size--;

        if (front == null) {
            rear = null;

        }

        return tempNode.data;
    }
}
