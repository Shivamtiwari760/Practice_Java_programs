package Udemy_course_120_examples;

import java.lang.reflect.GenericArrayType;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Project5 {

    public static void main(String[] args) {

        int day, month, year;

        int hour, minute, second;

        GregorianCalendar date = new GregorianCalendar();

        day = date.get(Calendar.DAY_OF_MONTH);

        month = date.get(Calendar.MONTH);

        year = date.get(Calendar.YEAR);

        hour = date.get(Calendar.HOUR);

        second = date.get(Calendar.SECOND);

        minute = date.get(Calendar.MINUTE);

        System.out.println("date is " + day + "/" + (month+1) + "/" + year) ;

        System.out.println("timing is " + hour + ":" + minute + ":" + second);


    }
}
