package com.nisrulz.github.insertion_sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {12, 90, 65, 11, 25, 22, 1, 80, 46};

        int[] sorted_arr = insertion_sort(arr);

        System.out.println(Arrays.toString(sorted_arr));
    }

    private static int[] insertion_sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
        return arr;
    }
}
