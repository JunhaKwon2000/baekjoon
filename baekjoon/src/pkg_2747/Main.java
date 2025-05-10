package pkg_2747;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = 0;
        int b = 1;
        int F = 1;
        int cnt = 2;

        while (true) {
            if (N == 1) {
                break;
            }
            else if (N == cnt) {
                break;
            }
            a = b;
            b = F;
            F = a + b;
            cnt++;
        }
        System.out.println(F);
        sc.close();
    }
}
