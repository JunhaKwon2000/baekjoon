package pkg_1269;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int i = 0; i < A; i++) setA.add(sc.nextInt());
        for (int i = 0; i < B; i++) setB.add(sc.nextInt());

        Set<Integer> duplA = new HashSet<>();
        duplA.addAll(setA);
        duplA.removeAll(setB);

        Set<Integer> duplB = new HashSet<>();
        duplB.addAll(setB);
        duplB.removeAll(setA);

        duplA.addAll(duplB);
        System.out.println(duplA.size());
        
        sc.close();

    }
}

