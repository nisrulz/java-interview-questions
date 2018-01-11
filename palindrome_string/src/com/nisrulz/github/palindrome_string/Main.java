package com.nisrulz.github.palindrome_string;

public class Main {

    /*
     A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as forward,
     such as madam or “taco cat” or racecar.
     */

    public static void main(String[] args) {
        String[] strArray = {"abcdcba", "abcd", "This is palindrome", "cat", "taco cat", "wow", "hello", "racecar", "madam"};

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(isPalindrome(strArray[i]) ? "[Palindrome] " + strArray[i] : "[Not Palindrome] " + strArray[i]);

        }
    }

    private static boolean isPalindrome(String str) {

        // replace spaces
        str = str.replace(" ", "");

        StringBuilder strBuilder = new StringBuilder(str);


        return strBuilder.reverse().toString().equalsIgnoreCase(str);
    }
}
