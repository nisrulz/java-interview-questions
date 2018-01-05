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
    int capacity;

    public StackBackedByLinkedList(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(int data) {
        if (size() >= capacity) {
            System.out.println("StackBackedByLinkedList is full!");
        } else {
            Node newNode = new Node(data);

            if (top == null) {
                top = newNode;
                return;
            }

            newNode.next = top.next;
            top.next = newNode;
            size++;
        }
    }

    @Override
    public int pop() {
        if (top == null) {
            System.out.println("StackBackedByLinkedList is empty!");
            return -1;
        }

        int val = top.data;
        top = top.next;
        size--;
        return val;
    }
}
