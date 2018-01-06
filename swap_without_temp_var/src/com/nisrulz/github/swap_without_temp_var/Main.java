package com.nisrulz.github.swap_without_temp_var;

public class Main {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.printf("\nNumbers to swap without using a temp variable: x = %d, y = %d", x, y);

        // Swap using sum and subtraction from sum
        System.out.println("\n\nMethod 1: Swap using sum and subtraction from sum");
        x = x + y; // x now becomes 15
        y = x - y; // y becomes 10
        x = x - y; // x becomes 5
        System.out.printf("After Swapping using method 1: x = %d, y = %d", x, y);


        // Swap using multiplication and division
        x=10; y=5; // reset variables
        System.out.println("\n\nMethod 2: Swap using multiplication and division");
        x = x * y; // x now becomes 50
        y = x / y; // y becomes 10
        x = x / y; // x becomes 5
        System.out.printf("After Swapping using method 2: x = %d, y = %d", x, y);


        // Swap using bitwise XOR, 'x' (1010) and 'y' (0101)
        x=10; y=5; // reset variables
        System.out.println("\n\nMethod 3: Swap using bitwise XOR");
        x = x ^ y; // x now becomes 15 (1111)
        y = x ^ y; // y becomes 10 (1010)
        x = x ^ y; // x becomes 5 (0101)
        System.out.printf("After Swapping using method 3: x = %d, y = %d", x, y);
    }
}
