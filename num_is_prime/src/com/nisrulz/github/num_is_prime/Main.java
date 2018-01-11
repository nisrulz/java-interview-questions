package com.nisrulz.github.num_is_prime;

public class Main {

    public static void main(String[] args) {

        System.out.println("Primes Numbers from 0-50:");
        for (int i = 0; i <= 50; i++) {
            System.out.print(isPrime(i) ? i + " " : "");
        }
    }


    public static boolean isPrime(int number) {
        // 0 and 1 are not prime numbers
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
