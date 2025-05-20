package pkg_14769;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        String[] arr2 = new String[N];

        String a = "";
        String b = "";

        for (int i = 0; i < N; i++) {
            a = sc.next();
            b = sc.next();
            try {
                arr[i] = Integer.parseInt(a) / 2;
                arr2[i] = b;
            } catch (Exception e) {
                arr[i] = Integer.parseInt(b);
                arr2[i] = a;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j <= (arr.length - 2) - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
                    String temp2 = arr2[j + 1];
					arr2[j + 1] = arr2[j];
					arr2[j] = temp2;
				}
			}
		}

        for (String items : arr2) System.out.println(items);

        sc.close();

    }
}
