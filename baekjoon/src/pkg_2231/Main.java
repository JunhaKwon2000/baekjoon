package pkg_2231;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int target = 10000000;
		
		if (N < 100) {
			for (int i = 0; i <= N; i++) {
				int a = i / 10;
				int b = i % 10;
				if((i + a + b == N) && (i <= target)) {
					target = i;
				}
			}
		}
		else if (N < 1000) {
			for (int i = 0; i <= N; i++) {
				int a = i / 100;
				int b = i % 100;
				int c = b / 10;
				int d = b % 10;
				if((i + a + c + d == N) && (i <= target)) {
					target = i;
				}
			}
			
		}
		else if (N < 10000) {
			for (int i = 0; i <= N; i++) {
				int a = i / 1000;
				int b = i % 1000;
				int c = b / 100;
				int d = b % 100;
				int e = d / 10;
				int f = d % 10;
				if((i + a + c + e + f == N) && (i <= target)) {
					target = i;
				}
			}
			
		}
		else if (N < 100000) {
			for (int i = 0; i <= N; i++) {
				int a = i / 10000;
				int b = i % 10000;
				int c = b / 1000;
				int d = b % 1000;
				int e = d / 100;
				int f = d % 100;
				int g = f / 10;
				int h = f % 10;
				if((i + a + c + e + g + h == N) && (i <= target)) {
					target = i;
				}
			}
			
		}
		else if (N < 1000000) {
			for (int i = 0; i <= N; i++) {
				int a = i / 100000;
				int b = i % 100000;
				int c = b / 10000;
				int d = b % 10000;
				int e = d / 1000;
				int f = d % 1000;
				int g = f / 100;
				int h = f % 100;
				int x = h / 10;
				int y = h % 10;
				if((i + a + c + e + g + x + y == N) && (i <= target)) {
					target = i;
				}
			}
			
		}
		
		
		if (target != 10000000) {
			System.out.println(target);			
		}
		else {
			System.out.println(0);
		}
		
	}

}
