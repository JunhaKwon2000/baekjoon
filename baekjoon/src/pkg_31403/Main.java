package pkg_31403;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int a = Integer.parseInt(Integer.toString(A) + Integer.toString(B));
        System.out.println(A + B - C);
        System.out.println(a - C);
        sc.close();

    }
}
