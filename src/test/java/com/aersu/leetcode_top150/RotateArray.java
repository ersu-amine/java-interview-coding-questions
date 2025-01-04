package com.aersu.leetcode_top150;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] num1 = new int[nums.length];

        int index = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i >= nums.length - k ) {
                num1[index] = nums[i];
                index++;
            }else {
                num1[k+i] = nums[i];
            }
        }
        System.out.println("Arrays.toString(num1) = " + Arrays.toString(num1));
    }

    @Test
    void test1() {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k =3;
        rotate(nums,k);
    }

    @Test
    void test2() {
        int[] nums = new int[]{-1,-100,3,99};
        int k =2;
        rotate(nums,k);
    }
}
