import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        for(int i = m; i>=1;i--){
            for(int j =1; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
