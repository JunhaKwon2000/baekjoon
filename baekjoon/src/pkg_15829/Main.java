package pkg_15829;
// 내가 푼거 아님!!()
// BigInteger, 나머지 연산(분배 법칙) -> 꼭 확인하기!!!

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        BigInteger sum = new BigInteger("0");

        String input = sc.nextLine();
        BigInteger power = new BigInteger("1");
        for (int i = 0; i < input.split("").length; i++) {
            char c = input.split("")[i].charAt(0);
            sum = sum.add(power.multiply(new BigInteger((int)(c - 96) + "")));
            power = power.multiply(new BigInteger("31"));
        }
        System.out.println(sum.remainder(new BigInteger("1234567891")));

        sc.close();

    }
}
