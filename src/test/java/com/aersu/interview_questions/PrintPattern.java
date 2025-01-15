package com.aersu.interview_questions;

public class PrintPattern {
    /*
    // Code to print the pattern

    *

    * *

    * * *

    * * * *

    * * * * *
     */

    public static void main(String[] args) {
        String str = "* ";
        for (int i = 1; i <= 5; i++) {
            System.out.println(str.repeat(i));
            System.out.println();
        }
    }
}
