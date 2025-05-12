package pkg_3208;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;

        r = r - 1;
        while (true) {
            if (r == 0 || c == 0) {
                break;
            }
            c--;
            cnt++;
            if (r == 0 || c == 0) {
                break;
            }
            r--;
            cnt++;
            if (r == 0 || c == 0) {
                break;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
