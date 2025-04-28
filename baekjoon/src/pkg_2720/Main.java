package pkg_2720;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        int[] arr = new int[testCase];
        
        for(int i = 0; i < arr.length; i++){
            int change = sc.nextInt();
            arr[i] = change;
        }
        
        for(int i = 0; i < arr.length; i++) {
            int changeQuarter = arr[i] / 25;
            int remainQuarter = arr[i] % 25;
            
            int changeDime = remainQuarter / 10;
            int remainDime = remainQuarter % 10;
            
            int changeNickel = remainDime / 5;
            int remainNickel = remainDime % 5;
            
            int changePenny = remainNickel;
            
            System.out.println(changeQuarter + " " + changeDime + " " + changeNickel + " " + changePenny);
        }
        sc.close();
		        
		        
		        
		}
	}
