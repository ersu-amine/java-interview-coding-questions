package com.aersu.interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveSpaces {
    //How do you remove spaces from a string in Java?

    public static String removeSpaces(String str){
        //remove spaces by replacing them with empty string
        str = str.replace(" ", "");
        return str;

        //another solution
        /*
         StringBuilder output = new StringBuilder();
         char[] charArray = input.toCharArray();

         for (char c : charArray) {
          if (!Character.isWhitespace(c))
           output.append(c);
         }

         return output.toString();
         */
    }

    @Test
    void test() {
        Assertions.assertEquals("timeNspace", removeSpaces("time N space"));
    }
}
