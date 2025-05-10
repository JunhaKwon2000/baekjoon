package pkg_10818;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            int v = sc.nextInt();
            arr[i] = v;
        }

        int max = -1000000;
        int min = 1000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }

            if (arr[i] <= min) {
                min = arr[i];
            }
        }

        System.out.println(min + " " + max);
        sc.close();
    }
}
