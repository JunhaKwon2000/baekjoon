package pkg_11050;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int NN = 1;
        int KK = 1;

        for (int i = N; i > (N - K); i--) {
            NN *= i;
        }
        for (int i = K; i > 0; i--) {
            KK *= i;
        }

        if (KK != 0) {
            System.out.println(NN / KK);
        }
        else {
            System.out.println(NN);
        }
        sc.close();

    }
}
