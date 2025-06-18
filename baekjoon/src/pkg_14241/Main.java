package pkg_14241;
// 수학 문제에서 곱하기는 항상 큰수로 해야 전체적인 수가 커질 수 있는 듯
// 이 로직을 알면 List 와 정렬을 통해 쉽게 풀 수 있는 문제

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        int score = 0;

        while (true) {
            int temp = list.get(0) + list.get(1);
            score += list.get(0) * list.get(1);
            list.add(temp);
            list.remove(0);
            list.remove(0);
            Collections.sort(list);
            if (list.size() == 1) break;

        }

        System.out.println(score);
        sc.close();

    }
}
