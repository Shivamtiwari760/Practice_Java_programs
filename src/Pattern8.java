import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        for(int i = m; i>=1;i--){
            for(int j = m; j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
