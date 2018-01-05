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

        if (top == arr.length - 1) {
            System.out.println("StackBackedByArray is full!");
            return;
        }
        arr[++top] = data;
    }

    @Override
    public int pop() {

        if (top == -1) {
            System.out.println("StackBackedByArray is empty!");
            return -1;
        }
        return arr[top--];
    }
}
