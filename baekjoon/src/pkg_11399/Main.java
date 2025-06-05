package pkg_11399;
// 너무 때려 맞춘 느낌? 왜 오름차순으로 정렬하면 제일 빠를지 고민 안하고 문제에서 그냥 오름차순으로 정렬되어있을 때 가장 빨랐으니까 그 로직만 구현한 느낌..
// 한번 다시 생각해봐!

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) list.add(sc.nextInt());

        Collections.sort(list);

        int sum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) sum += list.get(j);
        }

        System.out.println(sum);
        
        sc.close();

    }
}
