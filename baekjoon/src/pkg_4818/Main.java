package pkg_4818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) {

            int N = sc.nextInt();

            if (N > 0) {
                if (N == 1) {
                    int val = sc.nextInt();
                    if (50 >= 2 * val) {
                        System.out.print((50 / val + 1) + " ");
                    }
                    else {
                        System.out.print("0 ");
                    }
                    
                    if (60 >= 2 * val) {
                        System.out.print((60 / val + 1) + " ");
                    }
                    else {
                        System.out.print("0 ");
                    }
                    
                    if (70 >= 2 * val) {
                        System.out.print(70 / val + 1);
                    }
                    else {
                        System.out.print("0");
                    }
                    System.out.println();
                }
                else if (N >= 2) {
                    int sum = 0;
                    int max = 0;
                    int[] arr = new int[N];
                    for (int i = 0; i < N; i++) {
                        arr[i] = sc.nextInt();
                        if (arr[i] >= max) max = arr[i];
                        sum += arr[i];
                    }
                    if (50 >= 2 * sum) {
                        System.out.print((50 / max + 1) + " ");
                    }
                    else {
                        System.out.print("0 ");
                    }
                    
                    if (60 >= 2 * sum) {
                        System.out.print((60 / max + 1) + " ");
                    }
                    else {
                        System.out.print("0 ");
                    }

                    if (70 >= 2 * sum) {
                        System.out.print(70 / max + 1);
                    }
                    else {
                        System.out.print("0");
                    }
                    System.out.println();
                }

            }
            else if (N == 0) {
                break;
            }

        }
    
        sc.close();
    }

}
