package pkg_1620;
// 이중 for 문(또는 while 안에 for 문 등)은 매우 시간이 오래걸림
// 따라서 차라리 두개의 HashMap 을 만들고 String 값이 들어오면 하나는 key 로, 하나는 value 로 하도록 해서 알고리즘 구성

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String pokemon = sc.nextLine();
            map1.put(pokemon, i);
            map2.put(i, pokemon);
        }

        for (int i = 0; i < M; i++) {
            String check = sc.nextLine();
            try {
                int number = Integer.parseInt(check);
                System.out.println(map2.get(number));
            } catch (Exception e) {
                System.out.println(map1.get(check));
            }
        }
        
        sc.close();

    }
}

