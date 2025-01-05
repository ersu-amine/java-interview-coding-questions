package com.aersu.neetcode_150.arrays_hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LongestConsecutiveSeq {
    /*
    Example 1:

    Input: nums = [2,20,4,10,3,4,5]

    Output: 4
    Explanation: The longest consecutive sequence is [2, 3, 4, 5].

    Example 2:

    Input: nums = [0,3,2,5,4,6,1,1]

    Output: 7
     */
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            //if the sequence is broken
            if (nums[i] - 1 == nums[i - 1]) {
                count++;
            } else if (nums[i - 1] == nums[i]) {
                count += 0;
            } else {
                if (nums.length - count > count) {
                    count = 1;
                }
            }

        }

        return count;
    }

    @Test
    void test1() {

        int[] nums = new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        System.out.println(longestConsecutive(nums));
        Assertions.assertEquals(7,longestConsecutive(nums));
    }

    @Test
    void test2() {

        int[] nums = new int[]{2, 20, 4, 10, 3, 4, 5};
        Assertions.assertEquals(4,longestConsecutive(nums));
    }

    @Test
    void test3() {

        int[] nums = new int[]{0, 3, 2, 5, 4, 6, 1, 1};
        Assertions.assertEquals(7,longestConsecutive(nums));
    }


    @Test
    void test4() {

        //TODO
        int[] nums = new int[]{4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
        Assertions.assertEquals(5,longestConsecutive(nums));
    }
}
