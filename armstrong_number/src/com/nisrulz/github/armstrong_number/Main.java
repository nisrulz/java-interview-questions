package com.nisrulz.github.armstrong_number;

public class Main {

    /*
     An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the
     number itself.

     For example, 371 is an Armstrong number since 3*3*3 + 7*7*7 + 1*1*1 = 371.
     */

    public static void main(String[] args) {
        int startLimit = 1;
        int endLimit = 1000;

        System.out.printf("\nArmstrong Numbers from %d-%d: \n", startLimit, endLimit);

        for (int i = startLimit; i <= endLimit; i++) {
            System.out.print(isArmstrongNumber(i) ? i + " " : "");
        }
    }

    private static boolean isArmstrongNumber(int num) {
        int sum = 0;
        int val = num;
        int digit;

        while (val > 0) {
            digit = val % 10;
            // get the cube of the digit and add it to the sum
            sum += (digit * digit * digit);
            val /= 10;
        }

        if (sum == num) {
            return true;
        }

        return false;
    }
}
