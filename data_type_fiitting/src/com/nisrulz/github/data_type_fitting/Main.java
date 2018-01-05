package com.nisrulz.github.data_type_fitting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            dataTypeFitting(sc);
        }
    }


    private static void dataTypeFitting(Scanner sc) {
        try {
            long x = sc.nextLong();
            System.out.println(x + " can be fitted in:");
            if (x >= -128 && x <= 127) {
                System.out.println("* byte");
            }
            if (x >= -(Math.pow(2, 15)) && x <= (Math.pow(2, 15) - 1)) {
                System.out.println("* short");
            }
            if (x >= -(Math.pow(2, 31)) && x <= (Math.pow(2, 31) - 1)) {
                System.out.println("* int");
            }
            if (x >= -(Math.pow(2, 63)) && x <= (Math.pow(2, 63) - 1)) {
                System.out.println("* long");
            }
        } catch (Exception e) {
            System.out.println(sc.next() + " can't be fitted anywhere.");
        }
    }
}
