package pkg_25304;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalPrice = sc.nextInt();
		int numOfItems = sc.nextInt();
		
		int[] arrPrice = new int[numOfItems];
		int[] arrNum = new int[numOfItems];
		
		for (int i = 0; i < arrPrice.length; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			arrPrice[i] = price;
			arrNum[i] = num;
		}
		
		int totalPriceCompare = 0;
		for (int i = 0; i < arrPrice.length; i++) {
			int priceTimesNum = arrPrice[i] * arrNum[i];
			totalPriceCompare += priceTimesNum;
		}
		
		if(totalPriceCompare == totalPrice) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
