package com.nisrulz.github.decimal_to_binary;

public class Main {

    public static void main(String[] args) {
        int upperLimit = 10;

        for (int i = 0; i < upperLimit; i++) {
            System.out.printf("\nDecimal: [%d] ==> Binary: [%s]", i, decimalToBinary(i));
        }
    }

    private static String decimalToBinary(int decimalNumber) {

        StringBuilder moduloStringBuilder = new StringBuilder();

        if (decimalNumber == 0) {
            return "0";
        }

        while (decimalNumber > 0) {
            moduloStringBuilder.append((decimalNumber % 2));
            decimalNumber /= 2;
        }

        // the string builder consists of remainders in the reverse order, so we will reverse it to get the right answer
        moduloStringBuilder.reverse();

        String binaryNumber = moduloStringBuilder.toString();
        return binaryNumber;
    }
}
