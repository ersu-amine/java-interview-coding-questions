package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

public class AveragePrimeNumbers {
    /*
    Average of Prime Numbers in a Range:

// Code to find the average of all prime numbers in a given range
     */

    public static boolean isPrime(int number) {
        boolean prime = false;
        int factor = 0; //prime numbers have only 2 factors, 1 and number itself
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factor++; //find factors that divides number evenly
            }
        }

        //prime numbers have only 2 factors

        if (factor == 2) {
            prime = true;
        }

        return prime;
    }

    public static double averagePrime(int n, int k) {
        //how many numbers in the range
        int numberCount = Math.abs(n - k);

        int startIndex = Math.min(n, k);
        int endIndex = Math.max(n, k);
        System.out.println("startIndex = " + startIndex);
        System.out.println("endIndex = " + endIndex);

        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {

            //if number is prime add the number to sum
            if (isPrime(i)) {
                System.out.println("i = " + i);
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("numberCount = " + numberCount);
        return (double) sum / numberCount;
    }

    @Test
    void test1() {
        System.out.println(averagePrime(1,10));
    }


    @Test
    void test2() {
        System.out.println(averagePrime(10,1));
    }
}
