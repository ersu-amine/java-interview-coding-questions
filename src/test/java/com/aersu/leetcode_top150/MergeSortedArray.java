package com.aersu.leetcode_top150;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;

        //add nums2 to the empty part of nums1
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[index];
            index++;
        }

        //sort array
        Arrays.sort(nums1);
    }

    @Test
    void test1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        System.out.println("Arrays.toString(nums1) = " + Arrays.toString(nums1));
        int m = 3;

        int[] nums2 = {2,5,6};
        System.out.println("Arrays.toString(nums2) = " + Arrays.toString(nums2));
        int n = 3;

        merge(nums1,m,nums2, n);

        System.out.println("after merge nums1 = " + Arrays.toString(nums1));
    }

    @Test
    void test2() {
        int[] nums1 = {1};
        System.out.println("Arrays.toString(nums1) = " + Arrays.toString(nums1));
        int m = 1;

        int[] nums2 = {};
        System.out.println("Arrays.toString(nums2) = " + Arrays.toString(nums2));
        int n = 0;

        merge(nums1,m,nums2, n);

        System.out.println("after merge nums1 = " + Arrays.toString(nums1));
    }

    @Test
    void test3() {
        int[] nums1 = {0};
        System.out.println("Arrays.toString(nums1) = " + Arrays.toString(nums1));
        int m = 0;

        int[] nums2 = {1};
        System.out.println("Arrays.toString(nums2) = " + Arrays.toString(nums2));
        int n = 1;

        merge(nums1,m,nums2, n);

        System.out.println("after merge nums1 = " + Arrays.toString(nums1));
    }
}
