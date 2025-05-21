package pkg_20568;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int cryCnt = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) cryCnt++;
        }

        System.out.println(cryCnt);

        sc.close();


  }

}
