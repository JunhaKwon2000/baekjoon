package pkg_8975;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        List<String> list1 = new ArrayList<>();
        for(int i = 0; i < N; i++) list1.add(sc.nextLine());

        int check = N / 2;

        int M = sc.nextInt();
        sc.nextLine();
        List<String> list2 = new ArrayList<>();
        for(int i = 0; i < M; i++) list2.add(sc.nextLine());

        int cnt = 0;

        for (String s : list2) {
            if (list1.indexOf(s) != -1) {
                list1.remove(list1.indexOf(s));
            }
            cnt++;
            if (list1.size() <= check) break;
        }
        
        System.out.println(cnt);
        
        sc.close();

    }
}

