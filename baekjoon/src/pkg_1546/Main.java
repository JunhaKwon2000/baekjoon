package pkg_1546;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numOfScore = sc.nextInt();
		int[] arr = new int[numOfScore];
		
		int maxScore = 0;
		for (int i = 0; i < arr.length; i++) {
			int score = sc.nextInt();
			arr[i] = score;
			
			if(score >= maxScore) {
				maxScore = score;
			}
		}
		
		
		double totalSum = 0.0;
		double[] arr2 = new double[numOfScore];
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = ((double)arr[i] / (double)maxScore) * 100.0;
			totalSum += arr2[i];
		}
		
		double average = totalSum / (double)numOfScore;
		System.out.println(average);
		
		
	}

}
