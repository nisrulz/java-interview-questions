package com.nisrulz.github.selection_sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {11, 25, 12, 22, 64};

        // sort
        int[] sorted_array = selection_sort(arr);

        // print the array
        System.out.println(Arrays.toString(sorted_array));
    }


    private static int[] selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minValIndex] > arr[j]) {
                    minValIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minValIndex];
            arr[minValIndex] = temp;
        }

        return arr;

    }
}
