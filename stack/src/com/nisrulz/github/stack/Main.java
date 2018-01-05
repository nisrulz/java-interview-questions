package com.nisrulz.github.stack;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n>> StackBackedByArray:");
        StackBackedByArray stackBackedByArray = new StackBackedByArray(5);
        operateOnStack(stackBackedByArray);

        System.out.println("\n>> StackBackedByLinkedList:");
        StackBackedByLinkedList stackBackedByLinkedList = new StackBackedByLinkedList(5);
        operateOnStack(stackBackedByLinkedList);
    }


    private static void operateOnStack(Stack stack) {
        // Initially the stack is empty, so attempting to pop now should output empty stack
        int val = stack.pop();

        // add value to stack
        System.out.println("\n> Adding values to stack\n");
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            // get size of stack
            System.out.println("Value added " + i + ", Size of Stack: " + stack.size());
        }


        // remove value from stack
        System.out.println("\n> Removing values from stack\n");
        for (int i = 0; i < 6; i++) {
            val = stack.pop();
            System.out.println("Value removed " + val + ", Size of Stack: " + stack.size());
        }
    }
}
