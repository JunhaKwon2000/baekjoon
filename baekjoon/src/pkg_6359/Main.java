package pkg_6359;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] sol = new int[N];

        for (int i = 1; i <= N; i++) {

            int v = sc.nextInt();
            int[] arr = new int[v];
            arr[0] = 1;

            for (int j = 1; j <= arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if ((k + 1) % j == 0 && k != 0) {
                        if (arr[k] == 0) {
                            arr[k] = 1;
                        }
                        else {
                            arr[k] = 0;
                        }
                    }
                }
            }

            int cnt = 0;
            for (int x = 0; x < arr.length; x++) {
                if (arr[x] == 1) {
                    cnt++;
                }
            }

            sol[i - 1] = cnt;


        }


        for (int y = 0; y < sol.length; y++) {
            System.out.println(sol[y]);
        }

        sc.close();

    }
}
