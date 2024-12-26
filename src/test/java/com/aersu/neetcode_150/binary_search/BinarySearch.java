package com.aersu.neetcode_150.binary_search;

import org.junit.jupiter.api.Test;

public class BinarySearch {
    public static int search(int[] nums, int target){
        //my solution
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    //instructor solution binary search algorithm
    public static int binarySearch(int[] nums, int target){
        int leftIndex = 0 ;
        int rightIndex = nums.length-1;
        while (leftIndex<=rightIndex){
            int middleIndex = (leftIndex+rightIndex)/2;
            if(nums[middleIndex]> target){
                //look all values to the left of middle
                rightIndex = middleIndex-1;
            }else if (nums[middleIndex]<target){
                //look all values to the right of middle index
                leftIndex =middleIndex+1;

            }else{
                return middleIndex;
            }
        }
        return -1;
    }
    @Test
    void test() {
        //expect 3
        int[] nums = new int[]{-1, 0, 2, 4, 6, 8};

        System.out.println("search(nums,4) = " + search(nums, 4));

        System.out.println("binarySearch(nums,4) = " + binarySearch(nums, 4));
    }

    @Test
    void test2() {
        //expect -1
        int[] nums = new int[]{-1, 0, 2, 4, 6, 8};

        System.out.println("search(nums,3) = " + search(nums, 3));

        System.out.println("binarySearch(nums,3) = " + binarySearch(nums, 3));
    }
}

/*
You are given an array of distinct integers nums, sorted in ascending order, and an integer target.

Implement a function to search for target within nums. If it exists, then return its index, otherwise, return -1.

Your solution must run in
O(logn)

Example 1:

Input: nums = [-1,0,2,4,6,8], target = 4

Output: 3
Example 2:

Input: nums = [-1,0,2,4,6,8], target = 3

Output: -1
 */