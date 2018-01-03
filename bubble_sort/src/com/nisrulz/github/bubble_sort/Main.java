package com.nisrulz.github.bubble_sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {12, 90, 65, 11, 25, 22, 1, 80, 46};

        int[] sorted_arr = bubble_sort(arr);

        System.out.println(Arrays.toString(sorted_arr));
    }

    private static int[] bubble_sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
