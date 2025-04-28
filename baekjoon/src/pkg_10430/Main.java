package pkg_10430;
import java.util.Scanner;

class Q{
	public void func(int a, int b, int c) {
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}
}

public class Main {

	public static void main(String[] args) {
		Q q = new Q();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		q.func(a, b, c);

	}

}
