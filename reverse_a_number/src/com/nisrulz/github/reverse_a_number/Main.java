package com.nisrulz.github.reverse_a_number;

public class Main {


    public static void main(String[] args) {

        int startLimit = 100;
        int endLimit = 110;

        System.out.printf("\nReversed Numbers from %d-%d: \n", startLimit, endLimit);

        for (int i = startLimit; i <= endLimit; i++) {

            // printing the reversed number with left padding
            System.out.printf("\n%d ==> Reversed: %s", i, String.format("%03d", reverse_num(i)));
        }
    }

    public static int reverse_num(int num) {
        int sum = 0;
        int remainder;
        while (num > 0) {
            remainder = num % 10;
            sum = (remainder + (sum * 10));
            num /= 10;
        }
        return sum;
    }
}