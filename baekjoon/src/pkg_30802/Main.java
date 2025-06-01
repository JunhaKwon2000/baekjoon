package pkg_30802;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }

        int T = sc.nextInt();
        int P = sc.nextInt();

        int sizeResult = 0;

        for (int size : list) {
            if (size % T == 0) sizeResult += (size / T);
            else sizeResult += ((size / T) + 1);
        }
        
        System.out.println(sizeResult);
        System.out.println((N / P) + " " + (N % P));

        sc.close();

    }
}

