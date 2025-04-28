package pkg_2588;
import java.util.Scanner;

class Q{
	public void func(int a, int b) {
		int x = b / 100;
		int y = (b % 100) / 10;
		int z = b % 10;
		
		int zz = a * z;
		int yy = a * y;
		int xx = a * x;
		
		int xyz = a * b;
		
		System.out.println(zz);
		System.out.println(yy);
		System.out.println(xx);
		System.out.println(xyz);
	}
}

public class Main {

	public static void main(String[] args) {
		Q q = new Q();
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		q.func(a, b);
	}

}
