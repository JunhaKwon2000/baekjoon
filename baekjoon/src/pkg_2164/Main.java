package pkg_2164;
// 큐 자료구조를 이용하면 풀 수 있는 간단한 문제
// while 문을 break 하는 조건을 루프의 맨 위에 둬서 숫자 하나만 들어왔을 때 NPE 발생 방지

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();
        
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) q.offer(i);

        int cnt = 0;
        while (true) {
            if (q.size() == 1) break;
            if (cnt % 2 == 0) q.poll();
            else {
                int temp = q.peek();
                q.offer(temp);
                q.poll();
            }
            cnt++;
        }
        System.out.println(q.poll());

        sc.close();

    }
}
