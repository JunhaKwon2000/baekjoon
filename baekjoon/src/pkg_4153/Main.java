package pkg_4153;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        List<String> target = new ArrayList<>();
        
        while (true) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            if (list.indexOf(Integer.valueOf(0)) != -1) break;
            else {
                if (list.get(0) * list.get(0) + list.get(1) * list.get(1) == list.get(2) * list.get(2)) {
                    target.add("right");
                }
                else {
                    target.add("wrong");
                }
            }
        }

        for (String s : target) System.out.println(s);

        sc.close();

    }
}

