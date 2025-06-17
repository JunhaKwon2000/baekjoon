package pkg_6873;
// 문자열 + 배열, 리스트를 활용한 쉬운 문제

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        List<String> list = new ArrayList<>();
        while(true) {
            String temp = sc.nextLine();
            list.add(temp);
            if (temp.equals("SCHOOL")) break;
        }

        for (int i = list.size() - 2; i >= 0; i = i - 2) {
            if (i != 0) {
                if (list.get(i).equals("R")) System.out.println("Turn LEFT onto " + list.get(i - 1) + " street.");
                else if (list.get(i).equals("L")) System.out.println("Turn RIGHT onto " + list.get(i - 1) + " street.");
            } else {
                if (list.get(i).equals("R")) System.out.println("Turn LEFT into your HOME.");
                else if (list.get(i).equals("L")) System.out.println("Turn RIGHT into your HOME.");
            }
        }

        sc.close();

    }
}
