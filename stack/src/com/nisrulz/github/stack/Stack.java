package com.nisrulz.github.stack;

public class Stack {

    int[] arr;
    int top = -1;

    public Stack(int capacity) {
        arr = new int[capacity];
    }

    public int size() {
        return top + 1;
    }

    public void push(int data) {

        if (top == arr.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = data;
    }

    public int pop() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }
}
