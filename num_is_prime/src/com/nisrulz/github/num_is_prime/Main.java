package com.nisrulz.github.num_is_prime;

public class Main {

    public static void main(String[] args) {

        int startLimit = 20;
        int endLimit = 100;

        System.out.printf("\nPrimes Numbers from %d-%d: \n", startLimit, endLimit);

        for (int i = startLimit; i <= endLimit; i++) {
            System.out.print(isPrime(i) ? i + " " : "");
        }
    }

    public static boolean isPrime(int number) {
        // 0 and 1 are not prime numbers
        if (number < 2) {
            return false;
        }
        // any other number if it is divisible by any other number is not a prime number
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
