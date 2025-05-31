package pkg_1181;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class MyString implements Comparable<MyString> {

    String word;

    MyString(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(MyString o) {
        if (word.length() == o.word.length()) {
            return word.compareTo(o.word);
        }
        else return word.length() - o.word.length();
    }

    @Override
	public int hashCode() {
		return Objects.hash(word);
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		MyString other = (MyString) obj;
		return word.equals(other.word);
	}

}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        List<MyString> s = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            MyString word = new MyString(sc.nextLine());
            if (s.indexOf(word) == -1) s.add(word);
        }

        Collections.sort(s);
        for (MyString c : s) System.out.println(c.word);

        sc.close();

    }
}

