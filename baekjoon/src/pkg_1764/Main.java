package pkg_1764;
// 교집합을 구하는 문제
// 간단하게 TreeSet 으로 정렬된 집합 생성 후 retainAll() 메서드를 아무쪽에나 호출해 교집합만 가져오기 가능
// 참고로 retainAll() 의 return 값은 boolean 임, Set 이 아님!!(그냥 set 에 다른 set 과의 교집합만 남겨두고 싹 제거해주는 느낌)

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            String item = sc.nextLine();
            set1.add(item);
        }

        for (int i = 0; i < M; i++) {
            String item = sc.nextLine();
            set2.add(item);
        }

        set1.retainAll(set2);
        System.out.println(set1.size());
        for (String s : set1) System.out.println(s);

        sc.close();

    }
}
