package com.aersu.interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumIntArray {
    /*
        How do you get the sum of all elements in an integer array in Java?
     */

    public static int sumArray(int[] array){
        int sum = 0;
        for(int each : array){
            sum +=each;
        }
        return sum;
    }

    @Test
    void test() {
        Assertions.assertEquals(15,sumArray(new int[] {1,2,3,4,5}), "Values do not match");
        Assertions.assertEquals(5,sumArray(new int[] {-2,-5,3,4,5}), "Values do not match");
    }
}
