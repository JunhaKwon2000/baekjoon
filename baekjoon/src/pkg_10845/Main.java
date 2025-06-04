package pkg_10845;
// 우연? 코드 리뷰 필요!!
// Concurrent~ 이거를 LinkedList 로 바꾸니까 되었음

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        Queue<Integer> q = new LinkedList<>();
        int back = 0;
        for (int i = 0; i < N; i++) {
            String choice = sc.nextLine();
            if (choice.contains(" ")) {
                int temp = Integer.parseInt(choice.split(" ")[1]);
                q.add(temp);
                back = temp;
            } else if (choice.equals("pop")) {
                try {
                    int pop = q.remove();
                    System.out.println(pop);
                } catch (Exception e) {
                    System.out.println(-1);
                }
            } else if (choice.equals("size")) {
                System.out.println(q.size());
            } else if (choice.equals("empty")) {
                if (q.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (choice.equals("front")) {
                try {
                    System.out.println(q.element());
                } catch (Exception e) {
                    System.out.println(-1);
                }
            } else if (choice.equals("back")) {
                if (!q.isEmpty()) System.out.println(back);
                else System.out.println(-1);
            }
        }

        sc.close();

    }
}
