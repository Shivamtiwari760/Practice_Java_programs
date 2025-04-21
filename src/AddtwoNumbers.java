import java.util.Scanner;

public class AddtwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("The sum of two number is " + c);


    }
}
