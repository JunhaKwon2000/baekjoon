package pkg_2750;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for (int item : arr) System.out.println(item);
        
        sc.close();
    }
}
