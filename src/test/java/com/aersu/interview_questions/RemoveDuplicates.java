package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    /*
     Removing Duplicates from an Array:

    // Code to remove duplicates from an array
     */

    //replace duplicate with 0
    public static int[] removeDuplicates(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int k = i+1; k < array.length; k++) {
                if(array[i] == array[k]){
                    array[k] = 0;
                }
            }
        }
        return array;
    }

    public static Set<Integer> removeDuplicates2(int[] array){
        //set accepts only single copy of each element
        Set<Integer> num = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            num.add(array[i]);
        }
        return num;
    }

    @Test
    void test() {
        System.out.println(Arrays.toString(removeDuplicates(new int[]{2, 3, 4, 5, 4, 6})));
    }

    @Test
    void test2() {
        System.out.println(removeDuplicates2(new int[]{2, 3, 4, 5, 4, 6}));
    }
}

