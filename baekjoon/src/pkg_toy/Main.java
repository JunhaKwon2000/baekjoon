package pkg_toy;
// 30802

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        
        for (int i = M; i <= N; i++) {
            list.add(i);
        }
        
        List<Integer> primeNumber = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        
        if (M <= 2) {
            primeNumber.add(2);
            result.add(2);
            
            for (int s : list) {
                if (s <= 2) continue;
                int cnt = 0;

                for (int d : primeNumber) {
                    if (s % d == 0) break;
                    if (s % d != 0) cnt++;
                }

                if (cnt == primeNumber.size()) {
                    primeNumber.add(s);
                    result.add(s);
                }
            }
            
        }
        else if (M > 2) {
            primeNumber.add(2);

            for (int i = 3; i <= M; i++) {
                int cnt = 0;
                for (int d : primeNumber) {
                    if (i % d == 0) break;
                    if (i % d != 0) cnt++;
                }
                if (cnt == primeNumber.size()) {
                    primeNumber.add(i);
                }
            }

            for (int s : list) {
                int cnt = 0;

                for (int d : primeNumber) {
                    if (s % d == 0) break;
                    if (s % d != 0) cnt++;
                }

                if (cnt == primeNumber.size()) {
                    primeNumber.add(s);
                    result.add(s);
                }
            }
        }

        System.out.println(result);
        
        sc.close();

    }
}

