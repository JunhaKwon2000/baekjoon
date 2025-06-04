package pkg_17219;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            map.put(input.split(" ")[0], input.split(" ")[1]);
        }

        for (int i = 0; i < M; i++) {
            String key = sc.nextLine();
            System.out.println(map.get(key));
        }

        sc.close();

    }
}
