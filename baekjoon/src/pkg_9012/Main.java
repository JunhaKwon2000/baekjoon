package pkg_9012;
// () 이렇게 각 인덱스가 연속일 때 () 문자를 지워주는 알고리즘으로 구성
// list 에서 계속 remove 하는 방식("(" 를 먼저 제거, 그 인덱스를 ")" 가 채우므로 동일한 인덱스 제거)
// 만약 NO 면 예외가 발생하지 않고 코드가 끝까지 도착, YES 면 예외가 발생하므로(왜 그러는지는 다시 봐야함) try-catch 문으로 감싸
// 예외가 발생하면 YES, 아니면 NO 를 출력하도록 코드 구성

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int j = 0; j < N; j++) {
            String s = sc.nextLine();
            List<String> list = new ArrayList<>();
            for (String ss : s.split("")) list.add(ss);
        
            try {
                int idx = 0;
                while (true) {
                    if (list.get(idx).equals("(") && list.get(idx + 1).equals(")") && idx != list.size() - 1) {
                        list.remove(idx);
                        list.remove(idx);
                        idx = 0;
                    } else idx++;
                    if (idx == list.size() - 1) break;
                }
                System.out.println("NO");
            } catch (Exception e) {
                System.out.println("YES");
            }
        }

        sc.close();

    }
}

