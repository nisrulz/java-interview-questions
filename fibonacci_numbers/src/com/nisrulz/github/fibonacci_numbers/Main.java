package com.nisrulz.github.fibonacci_numbers;

public class Main {

    /*

    The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The next number is found by
    adding up the two numbers before it.

    Write a recursive method fib(n) that returns the nth Fibonacci number. n is 0 indexed, which means that in the
    sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., n == 0 should return 0 and n == 3 should return 2. Assume n is
    less than 15.
     */
    public static void main(String[] args) {
        int n = 10;

        System.out.println(">> fibonacci_recursive");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int fibonacci_number = fibonacci_recursive(i);
            stringBuilder
                    .append("Fibonacci Number for ")
                    .append(i)
                    .append(" = ")
                    .append(fibonacci_number).append("\n");
        }

        System.out.println(stringBuilder.toString());

        System.out.println(">> fibonacci_dynamic_prog");
        StringBuilder stringBuilder2 = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int fibonacci_number = fibonacci_dynamic_prog(i);
            stringBuilder2
                    .append("Fibonacci Number for ")
                    .append(i)
                    .append(" = ")
                    .append(fibonacci_number).append("\n");
        }

        System.out.println(stringBuilder2.toString());

    }

    private static int fibonacci_recursive(int n) {
        return n < 2 ? n : (fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2));
    }

    private static int fibonacci_dynamic_prog(int n) {
        if (n < 2) {
            return n;
        }

        int first = 0;
        int second = 1;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total = first + second;
            first = second;
            second = total;
        }

        return total;
    }
}
