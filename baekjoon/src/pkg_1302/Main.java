package pkg_1302;
// 들어온 단어 중 가장 많이 들어온 단어를 출력(동률일 시 사전순)하는 문제
// List, Set, Map 을 통해 구현함
// 마지막 try-catch 는 만약 모든 단어들이 unique 했을 때 catch 문으로, 아니면 try 문으로 가도록 하기 위함임

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        Set<String> set = new TreeSet<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int size = set.size();
            String word = sc.nextLine();
            set.add(word);
            if (size == set.size()) {
                if (!map.containsKey(word)) map.put(word, 1);
                else {
                    int v = map.get(word);
                    v++;
                    map.put(word, v);
                }
            }
        }

        int max = 0;
        for (String keys : map.keySet()) {
            int v = map.get(keys);
            if (v >= max) max = v;
        }

        Set<String> temp = new TreeSet<>();
        for (String keys : map.keySet()) {
            if (map.get(keys) == max) temp.add(keys);
        }

        
        List<String> result = new ArrayList<>(temp);
        try {
            System.out.println(result.get(0));
        } catch (Exception e) {
            List<String> whenOne = new ArrayList<>(set);
            System.out.println(whenOne.get(0));
        }

        sc.close();

    }
}

