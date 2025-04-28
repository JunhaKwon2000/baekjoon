package pkg_1076;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		long[] value = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		long[] multiply = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
		
		String pick1 = sc.next();
		String pick2 = sc.next();
		String pick3 = sc.next();
		
		int idx1 = Arrays.asList(color).indexOf(pick1);
		int idx2 = Arrays.asList(color).indexOf(pick2);
		int idx3 = Arrays.asList(color).indexOf(pick3);
		
		long value1 = value[idx1];
		long value2 = value[idx2];
		long value3 = multiply[idx3];
		
		long target = (value1 * 10 + value2)*value3;
		System.out.println(target);

		sc.close();
	}

}
