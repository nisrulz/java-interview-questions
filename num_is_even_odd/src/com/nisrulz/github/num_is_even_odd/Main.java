package com.nisrulz.github.num_is_even_odd;

public class Main {

    public static void main(String[] args) {
        int startLimit = 20;
        int endLimit = 100;
        System.out.printf("\nEven numbers from %d-%d: \n", startLimit, endLimit);
        for (int i = startLimit; i < endLimit; i++) {
            System.out.print(isEven(i) ? i + " " : "");
        }

        System.out.printf("\nOdd numbers from %d-%d: \n", startLimit, endLimit);
        for (int i = startLimit; i < endLimit; i++) {
            // if it is not even then it is odd
            System.out.print(isEven(i) ? "" : i + " ");
        }
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
