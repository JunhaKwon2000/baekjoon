package pkg_toy;
// 5345

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);


        String s = sc.nextLine();

        int cnt = 0;
        int target = 0;
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == 'P' || s.charAt(i) == 'p' && i >= idx) {
                cnt++;
                idx = i;
            }
            else if (s.charAt(i) == 'L' || s.charAt(i) == 'l' && i > idx) {
                if (s.charAt(idx) != 'L' && s.charAt(idx) != 'l' && s.charAt(idx) == 'P' || s.charAt(idx) == 'p') {
                    cnt++;
                    idx = i;
                }
            }
            else if (s.charAt(i) == 'U' || s.charAt(i) == 'u' && i > idx) {
                if (s.charAt(idx) != 'U' && s.charAt(idx) != 'u' && s.charAt(idx) == 'L' || s.charAt(idx) == 'l') {
                    cnt++;
                    if (cnt >= 3) {
                        target++;
                        cnt = 0;
                    }
                    idx = i;
                }
            }

        }

        // System.out.println(cnt);
        System.out.println(target);

        sc.close();

    }
}
