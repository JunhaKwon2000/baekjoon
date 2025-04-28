package pkg_2753;
import java.util.Scanner;

class Q{
	public int func(int year) {
		if(year % 4 == 0) {
			if(year % 100 != 0 || year % 400 == 0) {
				return 1;
			}
			else {
				return 0;
			}
			
		}
		else {
			return 0;
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Q q = new Q();
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		System.out.println(q.func(year));
		sc.close();

	}

}
