package pkg_1427;
// 내림차순하는 쉬운 문제
// Collections.sort() 는 기본 오름차순 정렬, 매개값으로 Comparator.reverseOrder() 넣으면 내림차순으로

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        String s = sc.nextLine();
        String[] ss = s.split("");
        List<Integer> list = new ArrayList<>();
        for (String sss : ss) list.add(Integer.parseInt(sss));

        Collections.sort(list, Comparator.reverseOrder());

        for (int i : list) System.out.print(i);
        
        sc.close();

    }
}

