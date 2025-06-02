package pkg_1259;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        List<String> result = new ArrayList<>();

        while (true) {
        
            String input = sc.nextLine();
            if (input.equals("0")) break;
            String left = "";
            String right = "";

            if (input.length() % 2 == 0) {
                left = input.substring(0, input.length() / 2);
                right = input.substring(input.length() / 2);
            }
            else {
                left = input.substring(0, input.length() / 2);
                right = input.substring((input.length() / 2) + 1);
            }

            List<String> list = new ArrayList<>();
            for (String s : right.split("")) {
                list.add(s);
            }

            Collections.reverse(list);
            right = "";
            for (String s : list) {
                right += s;
            }

            if (left.equals(right)) result.add("yes");
            else result.add("no");
        }

        for (String s : result) System.out.println(s);

        sc.close();

    }
}
