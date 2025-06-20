package pkg_14626;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        String isbn = sc.nextLine();

        int tempSum = 0;
        int starLoc = 0;
        for (int i = 0; i < isbn.length(); i++) {
            if (isbn.charAt(i) == '*') {
                starLoc = i;
                continue;
            }
            if ((i + 1) % 2 == 0) {
                tempSum += 3 * Integer.parseInt(isbn.charAt(i) + "");
            } else {
                tempSum += Integer.parseInt(isbn.charAt(i) + "");
            }
        }

        int target = 0;
        if ((starLoc + 1) % 2 == 0) {
            for (int i = 0; i <= 9; i++) {
                if ((tempSum + 3*i) % 10 == 0) {
                    target = i;
                    break;
                }
            }
        } else {
            for (int i = 0; i <= 9; i++) {
                if ((tempSum + i) % 10 == 0) {
                    target = i;
                    break;
                }
            }
        }
        System.out.println(target);

        sc.close();

    }
}
