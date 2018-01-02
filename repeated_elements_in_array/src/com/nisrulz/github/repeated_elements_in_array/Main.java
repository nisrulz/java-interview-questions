package com.nisrulz.github.repeated_elements_in_array;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {


    /*
    Write a method duplicate to find the repeated or duplicate elements in an array.
    This method should return a list of repeated integers in a string with the elements sorted in ascending order (as illustrated below).


    duplicate({1,3,4,2,1}) --> "[1]"

    duplicate({1,3,4,2,1,2,4}) --> "[1, 2, 4]"

    Note: You may use toString() method to return the standard string representation of most data structures, and
    Arrays.sort() to sort your result.
     */

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 1, 5, 1, 7, 8, 7, 3, 4, 9};
        System.out.println(duplicate(arr));

    }


    private static String duplicate(int[] arr) {
        Arrays.sort(arr);

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                treeSet.add(arr[i]);
            }
        }

        return treeSet.toString();
    }
}
