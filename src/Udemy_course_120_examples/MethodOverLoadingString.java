package Udemy_course_120_examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodOverLoadingString {

    String add(String x, String y){
        return x+y;
    }
}

class OverLoading{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Strings that needs to be performed operation");
        String a = br.readLine();
        String b = br.readLine();

        MethodOverLoadingString ol = new MethodOverLoadingString();

        System.out.println("String concetenation is " + ol.add(a, b) );



    }
}
