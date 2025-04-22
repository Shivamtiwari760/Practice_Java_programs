package Udemy_course_120_examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project4
{
    public static void main(String[] args) throws IOException {

        int num1,num2, output;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");

        num1 = Integer.parseInt(br.readLine());

        System.out.println("Enter another the number");

        num2 = Integer.parseInt(br.readLine());

        output = num1+num2;
        System.out.println("Result is " + output);

    }
}
