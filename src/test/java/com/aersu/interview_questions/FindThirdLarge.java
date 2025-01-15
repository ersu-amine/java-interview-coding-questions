package com.aersu.interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FindThirdLarge {
    /*
    Finding 3rd Largest Element (Using Bubble Sort):

    // Bubble Sort algorithm to find the 3rd largest element in an array
     */

    public static int bubleSort(int[] array){
        int temp; //temporary variable to hold value during swap

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        //last element is at index => array.length-1, therefore 3rd largest at array.length-3, if there are no duplicates
        return array[array.length-3];
    }

    @Test
    void test() {
        int[] arr = new int[]{5,4,7,8,2,3,1,11,10};
        Assertions.assertEquals(8,bubleSort(arr));
    }
}
