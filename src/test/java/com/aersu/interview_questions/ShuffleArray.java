package com.aersu.interview_questions;

import java.util.*;

public class ShuffleArray {
    /*
        How do you shuffle an array in Java?
     */

    public static void main(String[] args) {

        //using shuffle method from collection framework
        Integer[] array = {1,3,4,5,6,6};
        List<Integer> list = Arrays.asList(array);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

        //using for loop to manually shuffle
        Random random = new Random();
        System.out.println("array before manual shuffle" + Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
            int index = random.nextInt(0, array.length);
            //swap places
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        System.out.println("array after manual shuffle" + Arrays.toString(array));

    }


}
