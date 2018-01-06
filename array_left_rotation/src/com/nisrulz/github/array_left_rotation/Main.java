package com.nisrulz.github.array_left_rotation;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;
        System.out.println("Rotate\n " + Arrays.toString(arr) + "\nby 4 places to the left.");

        int[] rotatedArray = arrayLeftRotation(arr, arr.length, k);
        System.out.println("\nRotated array:\n " + Arrays.toString(rotatedArray));
    }


    private static int[] arrayLeftRotation(int[] a, int n, int k) {
        for (int i = 0; i < k; i++) {
            int temp = a[0];
            for (int j = 0; j < n - 1; j++) {
                a[j] = a[j + 1];
            }
            a[n - 1] = temp;
        }
        return a;

    }
}
