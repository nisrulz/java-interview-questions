package com.nisrulz.github.stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(4);

        int val;


        // will output stack is empty, because initially the stack is empty
        val = stack.pop();
        System.out.println(val);

        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        // Will output stack is full
        stack.push(0);

        val = stack.pop();
        System.out.println(val);
        val = stack.pop();
        System.out.println(val);
        val = stack.pop();
        System.out.println(val);
        val = stack.pop();
        System.out.println(val);

        // all values have been popped out as per capacity, will output stack is emty
        val = stack.pop();
        System.out.println(val);
    }
}
