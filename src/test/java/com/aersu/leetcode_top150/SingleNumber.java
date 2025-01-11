package com.aersu.leetcode_top150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class SingleNumber {

    //my solution with list, giving error with large data set
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);

        }

        int target = 0;
        for (Integer each : list) {
            if (Collections.frequency(list, each) == 1){
                target = each;
            }
        }

        return target;
    }

    //solution from website,
    public int singleNumber2(int[] nums) {
        // easily solved with XOR; when the same number is XORed, the result is 0.
        // just loop through the elements and XOR them; the non repeating number remains.
        int ans =0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
            System.out.println (ans);
        }
        return ans;
    }

    @Test
    void test1() {
        int[] nums = new int[]{2,2,1};
        Assertions.assertEquals(1,singleNumber(nums));
    }

    @Test
    void test2() {
        int[] nums = new int[]{4,1,2,1,2};
        Assertions.assertEquals(4,singleNumber(nums));
    }
}

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

    Example 1:

    Input: nums = [2,2,1]

    Output: 1

    Example 2:

    Input: nums = [4,1,2,1,2]

    Output: 4

    Example 3:

    Input: nums = [1]

    Output: 1
 */
