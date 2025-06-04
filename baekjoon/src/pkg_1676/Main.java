package pkg_1676;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();

        BigInteger number = new BigInteger("1");
        for (int i = 2; i <= N; i++) {
            number = number.multiply(new BigInteger(i + ""));
        }

        String result = number + "";
        int cnt = 0;
        int i = 0;
        while (true) {
            if (result.substring(0, (result.length() - i)).endsWith("0")) cnt++;
            else break;
            i++;
        }
        System.out.println(cnt);

        sc.close();

    }
}

