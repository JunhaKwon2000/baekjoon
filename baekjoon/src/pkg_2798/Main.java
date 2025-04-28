package pkg_2798;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		int M = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		int target = 0;
		for (int x = 0; x < arr.length; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				for (int z = y + 1; z < arr.length; z++) {
					int blackJack = arr[x] + arr[y] + arr[z];
					if (blackJack >= target && blackJack <= M) {
						target = blackJack;
					}
				}
			}
		}
		
		System.out.println(target);
		sc.close();
		
		
	}

}
