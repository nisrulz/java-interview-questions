package com.nisrulz.github.find_missing_number_in_array;

import java.util.Arrays;

public class Main {

    /*
     > Find the Missing Number in a Set of Numbers from 1 to 10

     Given an Array containing 9 numbers ranging from 1 to 10, write a method to find the missing number. Assume
     you have 9 numbers between 1 to 10 and only one number is missing.
     */
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Missing number: " + findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr) {
        int sumOfArrayItems = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArrayItems += arr[i];
        }

        int sumOfNumber1to10 = 0;
        for (int i = 1; i <= 10; i++) {
            sumOfNumber1to10 += i;
        }

        return sumOfNumber1to10 - sumOfArrayItems;
    }
}
