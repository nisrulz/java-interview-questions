package com.nisrulz.github.linear_search;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16};

        if (linear_search(arr, 20)) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found!");
        }

    }

    private static boolean linear_search(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return true;
            }
        }
        return false;
    }
}
