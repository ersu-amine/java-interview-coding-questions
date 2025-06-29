package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

public class Pyramid {
    //Create a pyramid pattern
    /*
            1
           2 2
          3 3 3
         4 4 4 4

     */

    public static void numberPyramid(int maxRow) {
        //using double for loop


        for (int i = 1; i <= maxRow; i++) {
            StringBuilder num = new StringBuilder(); //storing the current row
            String space = " "; //adding the leading spaces before the number
            space = space.repeat(maxRow - i);

            for (int j = 0; j < i; j++) {
                num.append(i).append(" ");
            }
            System.out.println(space + num);
        }
    }

    @Test
    void test() {
        numberPyramid(5);
    }
}
