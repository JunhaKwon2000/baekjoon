package pkg_1358;
// 주어진 좌표가 직사각형 안에 있을 때 카운트 +1
// 만약 직사각형 안이 아닐 때, x좌표를 직사각형의 왼쪽, 직사각형의 오른쪽 으로 나누어서 그 좌표와, 각 왼쪽/오른쪽에 있는 반원의 중심과
// 거리를 계산하여 그 거리 이하면은 카운트 +1
// 2차원 좌표평면상에서의 거리를 구할 줄 알면 쉽게 풀리는 문제

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = sc.nextInt();
        int result = 0;

        for (int i = 0; i < p; i++) {
            int p_x = sc.nextInt();
            int p_y = sc.nextInt();
            if ((p_x >= x && p_x <= x + w) && (p_y >= y && p_y <= y + h)) {
                result += 1;
            } else {
                if (p_x <= x) {
                    if (Math.pow(p_x - x, 2) + Math.pow(p_y - (y + h/2.0), 2) <= Math.pow(h / 2.0, 2)) {
                        result += 1;
                    }
                } else if (p_x >= x + w) {
                    if (Math.pow(p_x - (x + w), 2) + Math.pow(p_y - (y + h/2.0), 2) <= Math.pow(h / 2.0, 2)) {
                        result += 1;
                    }
                }
            }
        }

        System.out.println(result);

        sc.close();

    }
}

