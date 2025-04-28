package pkg_2444;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = num - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int x = 1; x <= num-1; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print(" ");
			}
			for(int z = 1; z <= 2*num-1-2*x; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
