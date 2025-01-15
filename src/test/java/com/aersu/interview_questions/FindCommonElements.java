package com.aersu.interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class FindCommonElements {
    /*
    Integer[] a1 = {1,2,3,2,1};

    Integer[] a2 = {1,2,3};

    Integer[] a3 = {1,2,3,4};

    // Output: {1,2,3}
     */

    public static Set<Integer> commonElements(Integer[] a1,Integer[] a2,Integer[] a3){
       Set<Integer> result = new HashSet<>();
       //List<Integer> list1 = new ArrayList<>(Arrays.asList(a1));
       List<Integer> list2 = new ArrayList<>(Arrays.asList(a2));
       List<Integer> list3 = new ArrayList<>(Arrays.asList(a3));

        for (Integer i : a1) {//iterate over element of array1
            if(list2.contains(i) && list3.contains(i)){ //check if other arrays have the same element
                result.add(i); //all 3 arrays have the element in them
            }
        }

        return result;
    }

    @Test
    void test() {
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};

        System.out.println(commonElements(a1,a2,a3));

    }
}
