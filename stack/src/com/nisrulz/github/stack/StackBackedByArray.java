package com.nisrulz.github.stack;

public class StackBackedByArray implements Stack {

    int[] arr;
    int top = -1;

    public StackBackedByArray(int capacity) {
        arr = new int[capacity];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public void push(int data) {

        if (!isFull()) {
            arr[++top] = data;
        } else {
            System.out.println("StackBackedByArray is full!");
            return;
        }

    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            return arr[top--];
        } else {
            System.out.println("StackBackedByArray is empty!");
            return -1;
        }

    }

    @Override
    public boolean isFull() {
        return (top == arr.length - 1);
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
