package com.aersu.interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncrementArrayAsNumber {
    /*
    Increment a Number Represented as an Array:
        Consider an array like [1, 2, 9], which represents the number 129. When you add one, the result should be [1, 3, 0].
        Similarly, [9, 9, 9] should become [1, 0, 0, 0].

     */

    public static int[] incrementArray(int[] array) {
        //make array components into String
        StringBuilder digits = new StringBuilder();
        for (int i : array) {
            digits.append(i);
        }

        //make number from the string
        int number = Integer.parseInt(digits.toString());

        //increment
        number = number + 1;

        // make into string and split into string array
        String[] split = String.valueOf(number).split("");

        //iterate each string in split[] and add it to int array as integer
        int[] resultArray = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            resultArray[i] = Integer.parseInt(split[i]);
        }
        return resultArray;
    }

    @Test
    void test() {
        Assertions.assertArrayEquals(new int[]{2, 3, 1}, incrementArray(new int[]{2, 3, 0}));
        Assertions.assertArrayEquals(new int[]{1, 0, 0}, incrementArray(new int[]{9,9}));
    }
}
