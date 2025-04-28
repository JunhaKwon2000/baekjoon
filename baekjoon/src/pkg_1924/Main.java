package pkg_1924;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int daysPassed = 0;
        for (int i = 0; i < M - 1; i++) {
            daysPassed += arr[i];
        }
        D -= 1;
        daysPassed += D;

        if (daysPassed % 7 == 0) {
            System.out.println("MON");
        }
        else if (daysPassed % 7 == 1) {
            System.out.println("TUE");
        }
        else if (daysPassed % 7 == 2) {
            System.out.println("WED");
        }
        else if (daysPassed % 7 == 3) {
            System.out.println("THU");
        }
        else if (daysPassed % 7 == 4) {
            System.out.println("FRI");
        }
        else if (daysPassed % 7 == 5) {
            System.out.println("SAT");
        }
        else if (daysPassed % 7 == 6) {
            System.out.println("SUN");
        }

        sc.close();
    }
}
