import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt();
        for(int i =1;i<=m;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
