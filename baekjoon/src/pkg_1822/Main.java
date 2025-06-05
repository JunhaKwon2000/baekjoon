package pkg_1822;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new TreeSet<>();

        for (int i = 0; i < A; i++) setA.add(sc.nextInt());
        for (int i = 0; i < B; i++) setB.add(sc.nextInt());

        setA.removeAll(setB);
        if (setA.size() == 0) System.out.println(0);
        else {
            System.out.println(setA.size());
            for(int i : setA) System.out.print(i + " ");
        }
        
        sc.close();

    }
}
