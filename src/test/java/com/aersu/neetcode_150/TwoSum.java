package com.aersu.neetcode_150;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class TwoSum {

    /*
    Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

    You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

    Return the answer with the smaller index first.

    Example 1:

    Input:
    nums = [3,4,5,6], target = 7

    Output: [0,1]
     */

    public static int[] sumTwoInteger(int[] num, int target){
        int[] index = new int[2];

        for(int i = 0; i<num.length-1; i++){
            for(int j = i+1; j < num.length; j++){
                if(num[i] + num[j] == target){
                    index[0]= i;
                    index[1]= j;
                }
            }
        }
        System.out.println(Arrays.toString(index));
        return index;
    }


    @Test
    void name() {
        int [] nums = {3,4,5,6};
        int target = 11;

        sumTwoInteger(nums, target);



    }
}
