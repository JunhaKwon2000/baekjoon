package pkg_1755;
// Collections.sort() -> 숫자는 오름차순, 문자는 알파벳 순서에 맞춰서 정렬해줌
// custom method 를 static 으로 선언해서 객체를 만들지 않고 유틸리티 메서드로 활용

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Util {
    public static String convert(int number) {
        String result = "";
        if (number == 1) result = "one";
        else if (number == 2) result = "two";
        else if (number == 3) result = "three";
        else if (number == 4) result = "four";
        else if (number == 5) result = "five";
        else if (number == 6) result = "six";
        else if (number == 7) result = "seven";
        else if (number == 8) result = "eight";
        else if (number == 9) result = "nine";
        else if (number == 0) result = "zero";
        return result;
    }

    public static int decode(String number) {
        int result = 0;
        if (number.equals("one")) result = 1;
        else if (number.equals("two")) result = 2;
        else if (number.equals("three")) result = 3;
        else if (number.equals("four")) result = 4;
        else if (number.equals("five")) result = 5;
        else if (number.equals("six")) result = 6;
        else if (number.equals("seven")) result = 7;
        else if (number.equals("eight")) result = 8;
        else if (number.equals("nine")) result = 9;
        else if (number.equals("zero")) result = 0;
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<String> list = new ArrayList<>();

        for (int i = N; i <= M; i++) {
            if (i <= 9) {
                list.add(Util.convert(i));
            } else if (i >= 10) {
                list.add(Util.convert(i / 10) + " " + Util.convert(i % 10));
            }
        }

        Collections.sort(list);
        
        List<Integer> target = new ArrayList<>();
        for (String s : list) {
            if (s.contains(" ")) {
                target.add(Util.decode(s.split(" ")[0]) * 10 + Util.decode(s.split(" ")[1]));
            } else {
                target.add(Util.decode(s));
            }
        }

        for (int i = 1; i <= target.size(); i++) {
            System.out.print(target.get(i - 1) + " ");
            if (i % 10 == 0) System.out.println();
        }
        
        sc.close();

    }
}

