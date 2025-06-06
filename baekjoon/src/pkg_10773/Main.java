package pkg_10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == 0) stack.pop();
            else stack.add(num);
        }

        int result = 0;
        if (!stack.isEmpty()) {
            for (int i : stack) result += i;   
        }

        System.out.println(result);
        
        sc.close();

    }
}
