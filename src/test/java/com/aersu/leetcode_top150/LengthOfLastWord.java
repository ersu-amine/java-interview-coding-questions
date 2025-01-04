package com.aersu.leetcode_top150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");

        return str[str.length - 1].length();

    }

    @Test
    void test() {
        String s = "Hello World";

        System.out.println(lengthOfLastWord(s));

        Assertions.assertEquals(5,lengthOfLastWord(s));
    }

    @Test
    void test2() {
        String s = "   fly me   to   the moon  ";

        System.out.println(lengthOfLastWord(s));

        Assertions.assertEquals(4,lengthOfLastWord(s));
    }

    @Test
    void test3() {
        String s = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s));

        Assertions.assertEquals(6,lengthOfLastWord(s));
    }
}
