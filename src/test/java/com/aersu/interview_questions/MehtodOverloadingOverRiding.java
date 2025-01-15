package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

public class MehtodOverloadingOverRiding extends Example {
    /*
    Code for Overriding and Overloading:

    // Explanation and demonstration of method overriding and overloading
     */

    //overloaded methods
    public static void printValue(String value){
        System.out.println(value);
    }

    public static void printValue(int value){
        System.out.println(value);
    }

    public static void printValue(boolean value){
        System.out.println(value);
    }

    //must have inheritance relationship to override
    @Override
    public int helloWorld() {
        System.out.println("Hello");
        return 2;
    }

    @Test
    void test() {
        //child class method
        helloWorld();

        //parent class method
        super.helloWorld();
    }
}
