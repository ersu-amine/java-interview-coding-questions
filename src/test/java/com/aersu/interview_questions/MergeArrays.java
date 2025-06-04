package com.aersu.interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArrays {
    /*
     Merge Two Arrays:
        For instance, if you have arr1 = {5, 3, 2} and arr2 = {9, 0, 1}, the task is to merge them into one array, resulting in {5, 3, 2, 9, 0, 1}.

     */

    public static int[] mergeArraysForLoop(int [] array1, int[] array2){
        int [] combined = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < combined.length; i++) {
            if(i<array1.length){
                combined[i] = array1[i];
            }else{
                combined[i] = array2[index];
                index++;
            }
        }

        System.out.println(Arrays.toString(combined));
        return combined;
    }

    public static int[] mergeArraysWithCopy(int [] array1, int[] array2){
        int [] combined = new int[array1.length + array2.length];

        System.arraycopy(array1,0,combined,0,array1.length);
        System.arraycopy(array2,0,combined,array1.length,array2.length);

        System.out.println(Arrays.toString(combined));
        return combined;
    }

    @Test
    void testMergingWithLoop() {
        Assertions.assertArrayEquals(new int[] {5,3,2,9,0,1}, mergeArraysForLoop( new int[]{5,3,2},new int[]{9,0,1}));
    }

    @Test
    void testMergingWithArrayCopy() {
        Assertions.assertArrayEquals(new int[] {7,1,4,5,1,2}, mergeArraysWithCopy( new int[]{7,1,4},new int[]{5,1,2}));
    }
}
