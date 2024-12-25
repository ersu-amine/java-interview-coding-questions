package com.aersu.leetcode_top150;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RemoveDuplicates {//from sorted array

    public int removeDuplicates(int[] nums) {
        //ordered array, max number is the last one
        // mark duplicate ones as the biggest number
        int max = nums[nums.length - 1] + 1;

        //keep track of how many uniques were there
        int size = nums.length;

        //iterate and set each duplicated number as the max number
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = max;
                size--;
            }
        }
        //duplicates are moved to the left after sort
        Arrays.sort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        return size;
    }

    //leaving 2 of each
    public int removeDuplicates2(int[] nums) {
        //ordered array, max number is the last one
        // mark duplicate ones as the biggest number
        int max = nums[nums.length - 1] + 1;

        //keep track of how many uniques were there
        int size = nums.length;

        //iterate and set each duplicated number as the max number, leave doubles, triples not allowed
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                nums[i] = max;
                size--;
            }
        }
        //duplicates are moved to the left after sort
        Arrays.sort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        //size of array that corresponds to the unique part
        return size;
    }

    @Test
    void test1() {
        int i = removeDuplicates(new int[]{1, 1, 2,});
        System.out.println("i = " + i);

        int j = removeDuplicates2(new int[]{1, 1, 1, 2, 2, 3});
        System.out.println("j = " + j);
    }

    @Test
    void test2() {
        int i = removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});

        System.out.println("i = " + i);

        int j = removeDuplicates2(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3});
        System.out.println("j = " + j);
    }
}
