package com.nisrulz.github.decimal_to_binary;

public class Main {

    public static void main(String[] args) {
        int decimalNumber = 5;

        System.out.printf("\nImplementation Type 1\nDecimal: [%d] ==> Binary: [%s]: \n", decimalNumber, decimalToBinary_1(decimalNumber));
    }

    private static String decimalToBinary_1(int decimalNumber) {

        String binaryNumber = "";

        while (decimalNumber != 0) {
            binaryNumber += (decimalNumber % 2);
            decimalNumber /= 2;
        }

        return binaryNumber;
    }
}
