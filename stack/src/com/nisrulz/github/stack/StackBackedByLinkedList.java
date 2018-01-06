package com.nisrulz.github.stack;

public class StackBackedByLinkedList implements Stack {
    class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    private Node top = null;
    private int size = 1;
    private int capacity;

    public StackBackedByLinkedList(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(int data) {
        if (!isFull()) {
            Node newNode = new Node(data);

            if (top == null) {
                top = newNode;
                return;
            }

            newNode.next = top.next;
            top.next = newNode;
            size++;
        } else {
            System.out.println("StackBackedByLinkedList is full!");
        }
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int val = top.data;
            top = top.next;
            size--;
            return val;
        } else {
            System.out.println("StackBackedByLinkedList is empty!");
            return -1;
        }
    }

    @Override
    public boolean isFull() {
        return size() >= capacity;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
