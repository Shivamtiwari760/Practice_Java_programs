package Udemy_course_120_examples;

class SwapValuesProject6 {
    public static void main(String[] args) {

        SwapFirst s1 = new SwapFirst(5, 10);
        System.out.println("number before the swapping are  " + s1.num1 + "\t" + s1.num2);

        SwapSecond s2 = new SwapSecond();
        s2.swap(s1);

        System.out.println("number after the swapping are  " + s1.num1 + "\t" +  s1.num2);


    }


    static class SwapFirst {
        int num1, num2, a, b;

        SwapFirst(int a, int b) {
            num1 = a;
            num2 = b;
        }
    }

    static class SwapSecond {
        void swap(SwapFirst s) {
            int output = s.num1;
            s.num1 = s.num2;
            s.num2 = output;
        }

    }
}
