package Udemy_course_120_examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodOverloading {

    int sum(int num1, int num2) {
        return num1 + num2;

    }


    public static class methodCall {

        public static void main(String[] args) throws IOException {


            int x, y;
            System.out.println("enter the number");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            x = Integer.parseInt(br.readLine());
            y = Integer.parseInt(br.readLine());
            MethodOverloading ol = new MethodOverloading();
            System.out.println("The output of the given program is " + ol.sum(x, y));


        }
    }

}