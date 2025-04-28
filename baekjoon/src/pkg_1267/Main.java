package pkg_1267;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            int value = sc.nextInt();
            arr[i] = value;
        }

        int Y = 0;
        int M = 0;
        for (int i = 0; i < arr.length; i++) {
            Y += (arr[i] / 30) * 10 + 10;
        }

        for (int i = 0; i < arr.length; i++) {
            M += (arr[i] / 60) * 15 + 15;
        }

        if (Y > M) {
            System.out.println("M " + M);
        }
        else if (Y < M) {
            System.out.println("Y " + Y);
        }
        else if (Y == M) {
            System.out.println("Y M " + Y);
        }
        sc.close();

    }
}
