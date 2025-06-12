package pkg_6032;
// 그냥 Collections.sort() 쓰면 쉽게 풀리는 쉬운 문제~

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        
        List<Double> list = new ArrayList<>();
        List<Integer> price = new ArrayList<>();
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            price.add(b);
            list.add(a / (double)b);
            result.add(a / (double)b);
        }

        Collections.sort(result, Comparator.reverseOrder());

        int cnt = 0;
        List<Integer> target = new ArrayList<>();
        for (double d : result) {
            target.add(list.indexOf(d));
            cnt++;
            if (cnt == 3) break;
        }

        int sum = 0;
        for (int i : target) {
            sum += price.get(i);
        }

        System.out.println(sum);
        for (int i : target) System.out.println(i + 1);

        sc.close();

    }
}
