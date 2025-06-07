package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenFirstOddLast {
    /*
    Rearrange Array:
        Given [2, 0, 4, 0, 3, 0, 5, 0], rearrange it so all even numbers come first and odd numbers last, like [0,0,0,0,2,4,3,5].
        [2, 0, 4, 0, 3, 0, 5, 0]
        [0, 0, 0, 0, 2, 3, 4, 5]

     */

    /**
     * method for arranging an int array by moving numbers based on their evenness and oddness, and displaying the resultant array
     * firstly all even numbers are stored into the array,then odd numbers are stored
     * without making additional arrays or lists
     *
     * @param array to be arranged
     *
     */
    public static void arrangeAndDisplay(int[] array) {
        //sort array from smallest to largest

        Arrays.sort(array);
        for (int k = 0; k < array.length; k++) {


            for (int i = k; i < array.length; i++) {

                if (array[i] % 2 != 0 && i != array.length - 1) {//if it is odd and not the last element, move to the right
                    if (array[i + 1] % 2 != 0 && array[i + 1] > array[i]) {//do nothing if the next number is odd and bigger
                        continue;
                    } else {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(array));

    }

    public static void arrangeAndDisplayWithList(int[] array) {
        //sort array from smallest to largest

        Arrays.sort(array);

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int number : array) {
            if(number%2==0){
                even.add(number);
            }else {
                odd.add(number);
            }

        }

        List<Integer> list = new ArrayList<>(even);
        list.addAll(odd);

        System.out.println(list);

    }



    @Test
    void testArrayManipulation() {
        int[] array = {2, 0, 4, 0, 3, 0, 5, 0};
        int[] array2 = {8, 0, 5, 0, 3, 0, 2, 0};

        arrangeAndDisplay(array);
        arrangeAndDisplay(array2);
    }

    @Test
    void testListManipulation() {
        int[] array = {2, 0, 4, 0, 3, 0, 5, 0};
        int[] array2 = {8, 0, 5, 0, 3, 0, 2, 0};

        arrangeAndDisplayWithList(array);
        arrangeAndDisplayWithList(array2);
    }
}
