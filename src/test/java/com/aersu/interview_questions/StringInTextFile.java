package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StringInTextFile {
    /*
    How can you find String in a text file?
     */

    public static void findStringInFile(String keyword, String path) throws IOException {
        //assuming keyword is given in lowercase
        FileInputStream file = null;
        try {
            file = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.err.println("File cannot be opened"); //exit to prevent loading null file to scanner
        }

        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {//when the file has lines
            String str = scan.nextLine();
            str = str.toLowerCase();

            //search if str contains keyword
            if (str.contains(keyword)) {//display message if keyword found
                System.out.println("The file contains the keyword '" + keyword + "'");
                break;//stop the loop once you find
            }
        }

        //close the file and scanner

        scan.close();
        file.close();
    }

    @Test
    void test() throws IOException {
        findStringInFile("away", "/Users/michealthonton/IdeaProjects/java-interview-coding-questions/src/test/resources/samplefile.txt");
    }
}
