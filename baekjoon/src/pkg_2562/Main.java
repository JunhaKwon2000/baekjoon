package pkg_2562;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            int v = sc.nextInt();
            arr[i] = v;
        }

        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(maxIdx);
        sc.close();
    }
}
