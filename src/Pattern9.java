
import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        for(int i = 1; i<=m;i++){
            for(int j = i; j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
