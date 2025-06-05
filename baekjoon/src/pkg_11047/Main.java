package pkg_11047;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int cnt = 0;
        while (true) {
            if (K == 0) break;
            int div = 0;
            for (int i : list) {
                if (i > K) break; 
                div = i;
            }
            cnt += K / div;
            K = K % div;
        }
        System.out.println(cnt);
        sc.close();

    }
}

