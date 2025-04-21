import java.util.Scanner;

public class swaptwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number before swapping : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number before swapping : ");
        int b = sc.nextInt();
//        int c = b;
//        b = a;
//        a = c;
//        System.out.println("Enter the first number after swapping : " + a);
//        System.out.println("Enter the first number after swapping : " + b);
//         returnSweappedNmber(a ,b);
//        returnSwapWithoutThirdvariable(a, b);
        SwappingUsingXor(a, b);
    }

//    public static void returnSweappedNmber(int a, int b){
//        int c = b;
//        b = a;
//        a = c;
//        System.out.println("Value of a is " + a
//                + " and Value of b is " + b);
//    }


//    public static void returnSwapWithoutThirdvariable(int a , int b){
//        a = a-b;
//        b = a+b;
//        a= b-a;
//        System.out.println("Value of a is " + a
//                + " and Value of b is " + b);
//    }

    // now swapping of two vriables using the XOR opertaions

    public static void SwappingUsingXor(int a , int b){
        a= a^b;
        b= a^b;
        a= a^b;
        System.out.println("Value of a is " + a
                + " and Value of b is " + b);

    }
}
