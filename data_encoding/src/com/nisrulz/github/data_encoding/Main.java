package com.nisrulz.github.data_encoding;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    /*
    >> Problem
    Given a list of numbers, e.g.:

    25626 25757 24367 24267 16 100 2 7277

    Output a delta encoding for the sequence. In a delta encoding, the first
    element is reproduced as is. Each subsequent element is represented as the
    numeric difference from the element before it. E.g. for the sequence above,
    the delta encoding would be:


    25626 131 -1390 -100 -24251 84 -98 7275

    However, if a difference value does not fit in a single signed byte,
    i.e. -127 <= x <= 127, then, instead of the difference, we would like
    to use an escape token, printing it.

    This will denote that the value following the escape token is a full
    four-byte difference value, rather than a one-byte different value.

    For this exercise, we'll declare -128 as the escape token.

    Following the same example above, the final result would be:

    25626 -128 131 -128 -1390 -100 -128 -24251 84 -98 -128 7275

     */

    private static final int ESCAPE_TOKEN = -128;

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String lineString = sc.nextLine();
        // split the number string on white spaces
        String[] values = lineString.split(" ");

        // parse each value into an integer
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }

        // encoded value
        System.out.println(encode(numbers));

    }


    public static String encode(int[] numbers) {
        LinkedList<Integer> numberList = new LinkedList<>();

        numberList.add(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            int diff = numbers[i] - numbers[i - 1];
            if (diff < -127 || diff > 127) {
                numberList.add(ESCAPE_TOKEN);
            }
            numberList.add(diff);
        }


        StringBuffer result = new StringBuffer();
        for (int i = 0; i < numberList.size(); i++) {
            result.append(numberList.get(i) + " ");
        }
        return result.toString();
    }
}

