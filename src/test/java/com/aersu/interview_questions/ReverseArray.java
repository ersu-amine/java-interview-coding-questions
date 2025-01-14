package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ReverseArray {
    //reverse order of elements in array

    //using simplest approach
    public static int[] reverseArray (int[] array){

        int [] array2 = new int[array.length];

        int index = 0;
        for (int i = array.length-1; i >= 0; i--) {
            array2[i] = array[index];
            index++;
        }
        return array2;
    }

    //using while loop
    public static void reverseArray2 (int[] array){

        int indexEnd = array.length-1;
        int indexBeginning = 0;
        while(indexBeginning< indexEnd){
            int temp = array[indexBeginning];
            array[indexBeginning] = array[indexEnd];
            array[indexEnd] = temp;
            indexBeginning++;
            indexEnd--;
        }

        //return array;
    }

    @Test
    void test1() {
        int[] array = new int[]{1,2,3,4,6,5};
        array=reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    void test2() {
        int[] array = new int[]{8,7,9,3,4,6,5};
        reverseArray2(array);
        System.out.println(Arrays.toString(array));
    }
}
