package pkg_1110;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int trueNum = N;
		int cnt = 0;
		
		while (true) {
			
			if (N < 10) {
				int a = 0;
				int b = N;
				int c = a + b;
				N = b * 10 + c;
				cnt++;
				if(N == trueNum) {
					break;
				}
			}
			else {
				int a = N / 10;
				int b = N % 10;				
				int c = a + b;
				N = b * 10 + c % 10;
				cnt++;
				if (N == trueNum) {
					break;
				}
			}
			

		}
		System.out.println(cnt);
		sc.close();
	}

}
