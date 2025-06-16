package pkg_2161;
// 처음에는 스택을 사용하려했으니, 큐를 사용하면 매우 쉽게 풀리는 문제
// 이미 풀었던 문제랑 비슷한 느낌임

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        
        int N = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) q.offer(i);

        while (true) {
            System.out.println(q.poll());
            if (q.isEmpty()) break;
            int temp = q.peek();
            q.poll();
            q.offer(temp);
        }

        sc.close();

    }
}

