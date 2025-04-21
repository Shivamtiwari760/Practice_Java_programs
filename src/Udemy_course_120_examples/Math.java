package Udemy_course_120_examples;

import javax.sound.midi.SysexMessage;

public class Math {
    public static void main(String[] args) {
        int num1 =5, num2=7,result1, result2, result3, result4;

        result1 = num1+num2;
        result2 = num1*num2;
        result3= num1/num2;
        result4= num2-num1;

        System.out.println("Addition to the results is " + result1);
        System.out.println("multiplication to the result is " + result2);
        System.out.println("Division to the result is"  +result3);
        System.out.println("subtraction to the result is " + result4);
    }

}
