package pkg_2609;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        int max = 0;
        int min = 0;

        if (N >= M) {
            max = N;
            min = M;
        }
        else {
            max = M;
            min = N;
        }

        int maxCommon = 0;
        for (int i = 1; i <= min; i++){
            if (min % i == 0) {
                if (max % i == 0) maxCommon = i;
            }
        }

        int minCommon = 0;
        int cnt = 1;
        while (true) {
            if ((max * cnt) % min == 0) {
                minCommon = max * cnt;
                break;
            } 
            cnt++;
        }

        System.out.println(maxCommon);
        System.out.println(minCommon);

        sc.close();

    }
}

