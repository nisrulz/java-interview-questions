package com.nisrulz.github.unique_chars_in_string;

import java.util.HashSet;

public class Main {

    /*
    Write a method that takes in an input String and returns true if all the characters in the String are unique and
    false if there is even a single repeated character.
    The method should return true if the input is null or empty String.

    Examples:
    areAllCharactersUnique("abcde") -> true


    areAllCharactersUnique("aa") -> false


    areAllCharactersUnique("") -> true


    areAllCharactersUnique(null) -> true

     */

    public static void main(String[] args) {
        System.out.println("\n1st Method");
        System.out.println(areAllCharactersUnique("abcde"));
        System.out.println(areAllCharactersUnique("aa"));
        System.out.println(areAllCharactersUnique(""));
        System.out.println(areAllCharactersUnique(null));


        System.out.println("-------------\n2nd Method");
        System.out.println(areAllCharactersUnique_2ndMethod("abcde"));
        System.out.println(areAllCharactersUnique_2ndMethod("aa"));
        System.out.println(areAllCharactersUnique_2ndMethod(""));
        System.out.println(areAllCharactersUnique_2ndMethod(null));

    }

    private static boolean areAllCharactersUnique(String str) {
        boolean[] asciiArr = new boolean[256];
        if (str != null && str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                int val = str.charAt(i);

                if (asciiArr[val]) {
                    return false;
                } else {
                    asciiArr[val] = true;
                }
            }
        }
        return true;
    }


    private static boolean areAllCharactersUnique_2ndMethod(String str) {

        if (str == null || str.length() <= 0) {
            return true;
        }

        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hashSet.add(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
