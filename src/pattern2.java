import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ennter the number of rows ");
        int m = sc.nextInt();
        System.out.println("Ennter the number of columns ");
        int n = sc.nextInt();
        for(int i = 1; i<=m;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
