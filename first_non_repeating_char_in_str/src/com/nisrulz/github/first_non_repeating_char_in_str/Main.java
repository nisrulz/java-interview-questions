package com.nisrulz.github.first_non_repeating_char_in_str;

public class Main {

    public static void main(String[] args) {

        String str = "HelloWorldHello";
        System.out.println("String: " + str);
        System.out.println("First non-repeating character in string: " + firstNonRepeatingCharInStr(str));
    }

    private static char firstNonRepeatingCharInStr(String str) {

        char[] count = new char[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int j = 0; j < 256; j++) {
            if (count[j] == 1) {
                return (char) j;
            }
        }

        return 0;

    }
}
