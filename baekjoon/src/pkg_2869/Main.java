package pkg_2869;
// 우연?

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        if ((V - A) % (A - B) == 0) {
            System.out.println(((V - A) / (A - B)) + 1);
        } else {
            System.out.println(((V - A) / (A - B)) + 2);
        }

        sc.close();

    }
}
