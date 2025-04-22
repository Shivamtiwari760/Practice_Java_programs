import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int num1, num2, output;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter the First number");

        num1= Integer.parseInt(br.readLine());

        System.out.println("enter the second number");

        num2= Integer.parseInt(br.readLine());

        output = num1 + num2;

        System.out.println("Result is : " + output);
    }
}