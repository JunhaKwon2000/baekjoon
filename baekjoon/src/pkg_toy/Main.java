package pkg_toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 1 ; i <= N; i++) list.add(i);
        int idx = 0;

        List<Integer> result = new ArrayList<>();

        while (true) {
            if (list.size() < K) break;
            idx = idx + (K - 1);
            if (idx > (list.size() - 1)) {
                idx = idx - list.size();
            }
            result.add(list.get(idx));
            list.remove(idx);
        }
        
        String resultStr = "<";
        for (int i : result) resultStr += (i + ", ");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) resultStr += (list.get(i));
            else resultStr += (list.get(i) + ", ");
        }
        resultStr += ">";
        System.out.println(resultStr);

        sc.close();

    }
}
