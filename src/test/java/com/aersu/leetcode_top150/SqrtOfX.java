package com.aersu.leetcode_top150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtOfX {
    /*
    Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
     */

    public int mySqrt(int x) {

        return (int) Math.sqrt(x);
    }
    @Test
    void test1() {
        Assertions.assertEquals(2,mySqrt(4));
    }

    @Test
    void test2() {
        Assertions.assertEquals(2,mySqrt(8));
    }

    @Test
    void test3() {
        Assertions.assertEquals(5,mySqrt(25));
    }

}
