package pkg_1453;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] arr = new int[N];

    for(int i = 0; i < arr.length; i++) {
        int num = sc.nextInt();
        arr[i] = num;
    }

    
    for(int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                arr[j] = -1;
            }
        }
    }

    int noSeat = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
            noSeat++;
        }
    }
    
    System.out.println(noSeat);
    sc.close();

    }
}
