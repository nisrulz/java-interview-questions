package com.nisrulz.github.stack;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n>> StackBackedByArray:");
        StackBackedByArray stackBackedByArray = new StackBackedByArray(5);
        operateOnStack(stackBackedByArray);

        System.out.println("\n>> StackBackedByLinkedList:");
        StackBackedByLinkedList stackBackedByLinkedList = new StackBackedByLinkedList();
        operateOnStack(stackBackedByLinkedList);
    }


    private static void operateOnStack(Stack stack) {
        // Initially the queue is empty, so attempting to dequeue now should output empty queue
        int val = stack.pop();

        // add value to queue
        System.out.println("\n> Adding values to stack\n");
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            // get size of queue
            System.out.println("Value added " + i + ", Size of Stack: " + stack.size());
        }


        // remove value from queue
        System.out.println("\n> Removing values from stack\n");
        for (int i = 0; i < 7; i++) {
            val = stack.pop();
            System.out.println("Value removed " + val + ", Size of Stack: " + stack.size());
        }
    }
}
