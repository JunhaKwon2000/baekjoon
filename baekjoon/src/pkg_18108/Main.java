package pkg_18108;
import java.util.Scanner;

class Taiwan{
	public int func(int year) {
		int tYear = year - 543;
		return tYear;
	}
}

public class Main {

	public static void main(String[] args) {
		
		Taiwan tw = new Taiwan();
		Scanner sc = new Scanner(System.in);
		int yearNow = sc.nextInt();
		System.out.println(tw.func(yearNow));
		sc.close();

	}

}
