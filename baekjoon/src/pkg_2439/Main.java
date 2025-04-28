package pkg_2439;
import java.util.Scanner;


class Q{
	public void func(int x) {
		for(int i = 1; i <= x; i++) {
			for(int j = x-i-1; j >= 0; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Q q = new Q();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		q.func(x);
		sc.close();
	}

}
