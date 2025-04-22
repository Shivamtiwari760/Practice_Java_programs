package Udemy_course_120_examples;

import java.io.PrintWriter;

public class Writer {

    public static void main(String[] args) {

        PrintWriter pt = new PrintWriter(System.out, true);
        String s2 = "project 2";
        pt.println("This is a " + s2);
    }
}
