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
        array[1] = numbers[numbers.length-2]; //second largest num at index max-1
        return array;
    }

    @Test
    void test() {
        int[] num = {2,3,8,10,5,1,9,4};

        System.out.println(Arrays.toString(secondMinMax(num)));
    }
}
