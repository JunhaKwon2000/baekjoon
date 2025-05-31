package pkg_11645;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        while (N > 0) {
            int M = sc.nextInt();
            sc.nextLine();
            Set<String> s = new HashSet<>();
            for (int i = 0; i < M; i++) {
                s.add(sc.nextLine());
            }
            list.add(s.size());
            N--;
        }

        for (int cnt : list) System.out.println(cnt);
        sc.close();


    }

}
