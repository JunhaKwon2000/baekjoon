package pkg_10926;
import java.util.Scanner;

class Q {
	public String func(String id) {
		return id + "??!";
	}
}

public class Main {

	public static void main(String[] args) {
		Q q = new Q();
		Scanner sc = new Scanner(System.in);
		String validId = sc.next();
		System.out.println(q.func(validId));
		sc.close();
	}

}
