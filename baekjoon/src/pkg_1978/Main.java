package pkg_1978;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int cnt = 0;

        for (int i : list) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) c++;
                if (c >= 3) break;
            }
            if (c == 2) cnt++;
        }

        System.out.println(cnt);

        sc.close();

    }
}
