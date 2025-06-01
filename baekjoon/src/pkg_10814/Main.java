package pkg_10814;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Judge implements Comparable<Judge> {

    int order;
    int age;
    String name;

    Judge(int order, int age, String name) {
        this.order = order;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Judge o) {
        if (age == o.age) return order - o.order;
        else return age - o.age;
    }

    @Override
	public int hashCode() {
		return Objects.hash(age, name, order);
	}
}


public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        List<Judge> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            String n = sc.next();
            list.add(new Judge(i, a, n));
        }

        Collections.sort(list);

        for (Judge j : list) {
            System.out.println(j.age + " " + j.name);
        }

        sc.close();

    }
}

