package pkg_1026;
// 두 배열의 곱셈의 최소이므로 하나는 ASC, 다른 하나는 DESC 로 정렬해서 곱하면 최소임
// 문제에서는 배열 B를 정렬하지 말라고 했지만, 사실 합은 인덱스는 신경 안써도 되기에 그냥 둘다 정렬해버림
// 정렬하는 방법만 알면 쉽게 풀리는 문제

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        for (int i = 0; i < N; i++) A.add(sc.nextInt());
        for (int i = 0; i < N; i++) B.add(sc.nextInt());

        Collections.sort(A);
        Collections.sort(B, Comparator.reverseOrder());

        int S = 0;
        for (int i = 0; i < N; i++) S += A.get(i) * B.get(i);
        System.out.println(S);
        
        sc.close();

    } 
}

