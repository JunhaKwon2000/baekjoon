package pkg_10828;

// 백준에서 그냥 Exception 타입이 아닌 특정 Exception 을 Catch 하면 시간초과가 뜸 (아마 모든 종류의 에외가 아닌 그 특정 예외만 잡아야해서 더 느린듯..)
// 특정 예외를 잡아도 되지만, 시간 초과 이슈로 코드에서는 그냥 Exception 으로 통일함
// import java.util.EmptyStackException;
// import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            String choice = sc.nextLine();
            if (choice.contains(" ")) {
                stack.add(Integer.parseInt(choice.split(" ")[1]));
            } else if (choice.equals("pop")) {
                try {
                    int pop = stack.pop();
                    System.out.println(pop);
                } catch (Exception e) {
                    System.out.println(-1);
                }
            } else if (choice.equals("size")) {
                System.out.println(stack.size());
            } else if (choice.equals("empty")) {
                if (stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (choice.equals("top")) {
                try {
                    System.out.println(stack.lastElement());
                } catch (Exception e) {
                    System.out.println(-1);
                }
            }

        }


        sc.close();

    }
}

