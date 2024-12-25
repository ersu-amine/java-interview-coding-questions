package com.aersu.leetcode_top150;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    //return most frequent element from the array
    public int majorityElement(int[] nums) {
        //map to store number and its frequency
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            //if the map contains the key, update its frequency
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);

            //if not in the map, frequency is 1
            }else{
                map.put(nums[i],1);
            }
        }
        
        //iterate over the entry set and find max frequency
        int maxFrequency = 0;
        Integer key = null;
        for(Map.Entry<Integer, Integer> each: map.entrySet()){
            if(each.getValue()>maxFrequency){
                maxFrequency = each.getValue();
                key = each.getKey();
            }
        }
        return key;
        }


    @Test
    void test1() {
        System.out.println("[3,2,3] = " + majorityElement(new int[]{3, 2, 3}));
    }

    @Test
    void test2() {
        System.out.println("[2,2,1,1,1,2,2] = " + majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    @Test
    void test3() {
        System.out.println("[3,3,4] = " + majorityElement(new int[]{3,3,4}));
    }

    @Test
    void test4() {
        System.out.println("[3,3,4,4,5,5,5,5,5,6,6] = " + majorityElement(new int[]{3,3,4,4,4,5,5,5,5,5,6,6}));
    }
}
