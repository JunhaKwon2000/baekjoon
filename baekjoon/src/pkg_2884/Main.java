package pkg_2884;
import java.util.Scanner;

class Q{
	int alarm = 45;
	void func(int h, int m) {
		int alarmHour, alarmMinute;
		if(m - 45 < 0) {
			if(h == 0) {
				alarmHour = 23;
				alarmMinute = 60 - (45 - m);
			}
			else {
				alarmHour = h - 1;
				alarmMinute = 60 - (45 - m);	
			}
		}
		else {
			alarmHour = h;
			alarmMinute = m - 45;
		}
		System.out.println(alarmHour + " " + alarmMinute);
			
	}
}

public class Main {

	public static void main(String[] args) {
		Q q = new Q();
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();

		q.func(h, m);
	}

}
