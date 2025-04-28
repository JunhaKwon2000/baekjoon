package pkg_11382;
import java.util.Scanner;

class Q{
	public long func(long a, long b, long c) {
		return a + b + c;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q q = new Q();
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		System.out.println(q.func(a, b, c));
		sc.close();
		
	}

}
