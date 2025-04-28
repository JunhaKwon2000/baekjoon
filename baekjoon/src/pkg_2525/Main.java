package pkg_2525;
import java.util.Scanner;

class Q {
	void func(int h, int m, int cookTime){
		int tempH = cookTime / 60;
		int tempM = cookTime % 60;
		
		int cookH, cookM;
		
		if(m + tempM >= 60) {
			if(h == 23) {
				cookH = tempH;
				cookM = tempM - (60 - m);
			}
			else {
				cookH = h + tempH + 1;
				cookM = tempM - (60 - m);	
			}
		}
		else {
			cookH = h + tempH;
			cookM = m + tempM;
		}
		
		if(cookH >= 24) {
			cookH = cookH - 24;
		}
		System.out.println(cookH + " " + cookM);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Q q = new Q();
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int cookTime = sc.nextInt();

		q.func(h, m, cookTime);

	}

}
