package com.nisrulz.github.replace_all_spaces;

public class Main {

    /*
    Write a method to replace all spaces in a string with a given replacement string.

    replace("This is a test","/") --> "This/is/a/test"

    Note: Avoid using the in-built String.replaceAll() method.
     */

    public static void main(String[] args) {
        System.out.println(replace("This is a test", "/"));
    }

    private static String replace(String txt, String replaceCharacter) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < txt.length(); i++) {
            char val = txt.charAt(i);
            if (val == ' ') {
                builder.append(replaceCharacter);
            } else {
                builder.append(val);
            }
        }

        return builder.toString();
    }
}
