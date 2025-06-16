package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SecondLargestSmallest {
    /*
    // Code to find second largest and second smallest numbers in an array
     */

    public static int[] secondMinMax(int[] numbers) {
        int[] array = new int[2]; //to store second largest and smallest

        Arrays.sort(numbers);
        array[0] = numbers[1];// second smallest number at index 1
        array[1] = numbers[numbers.length - 2]; //second largest num at index max-1
        return array;
    }

    public static int[] secondMinMaxWithLoop(int[] numbers) {
        int[] array = new int[2]; //to store second largest and smallest

        //if built in methods are not allowed, use loop
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i : numbers) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax) {
                secondMin = i;
            }

            if (i < min) {
                secondMin = min;
                min = i;
            } else if (i < secondMin) {
                secondMin = i;
            }
        }
        array[0] = secondMin;
        array[1] = secondMax;

        return array;
    }


    @Test
    void test() {
        int[] num = {2, 3, 8, 10, 5, 1, 9, 4};

        System.out.println(Arrays.toString(secondMinMax(num)));
        System.out.println(Arrays.toString(secondMinMaxWithLoop(num)));
    }
}
