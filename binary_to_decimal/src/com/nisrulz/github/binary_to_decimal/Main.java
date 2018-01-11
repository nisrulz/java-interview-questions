package com.nisrulz.github.binary_to_decimal;

public class Main {

    public static void main(String[] args) {
        String binaryNumber = "0101";

        System.out.printf("\nImplementation Type 1\nBinary: [%s] ==> Decimal: [%d]: \n", binaryNumber, binaryToDecimal_1(binaryNumber));

        System.out.printf("\nImplementation Type 2\nBinary: [%s] ==> Decimal: [%d]: \n", binaryNumber, binaryToDecimal_2(Integer.parseInt(binaryNumber)));
    }

    private static int binaryToDecimal_1(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }

    private static int binaryToDecimal_2(int binaryNumber) {
        int decimal = 0, p = 0;

        while (binaryNumber != 0) {
            decimal += ((binaryNumber % 10) * Math.pow(2, p));
            binaryNumber = binaryNumber / 10;
            p++;
        }
        return decimal;
    }
}
