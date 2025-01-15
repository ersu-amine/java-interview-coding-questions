package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MaxMinArray {
    //Find max and min inside an array

    //use sort
    public static void findMaxMin(int[] numbers){
        Arrays.sort(numbers);

        System.out.println("Max number is " + numbers[numbers.length-1]);
        System.out.println("Min number is " + numbers[0]);
    }

    //use loop
    public static void findMaxAndMin(int[] numbers){
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min = numbers[i];
            }
            if(numbers[i]>max){
                max = numbers[i];
            }
        }

        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);
    }

    @Test
    void test() {
        findMaxMin(new int[] {13,8,-7,9,8,14,10});
    }

    @Test
    void test2() {
        findMaxAndMin(new int[] {-12,8,9,4,16,6,30,4,26});
    }
}
