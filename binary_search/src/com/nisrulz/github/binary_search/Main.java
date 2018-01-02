package com.nisrulz.github.binary_search;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 10, 78, 2, 45, 14, 17, 9, 21, 99};
        // sort the array first
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int result = binary_search(arr, 17);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    private static int binary_search(int[] arr, int valueToFind) {
        int p = 0;
        int r = arr.length - 1;

        while (p <= r) {
            int q = (p + r) / 2;
            if (arr[q] == valueToFind) {
                return q;
            } else if (arr[q] > valueToFind) {
                r = q - 1;
            } else {
                p = q + 1;
            }
        }

        return -1;
    }
}
