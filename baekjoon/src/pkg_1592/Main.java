package pkg_1592;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int[] arr = new int[N];

        arr[0] = 1;
        int currentIndex = 0;
        int tempIndex = 0;
        int throwCount = 0;

        while(true) {

            if (arr[currentIndex] == M) {
                break;
            }

            if (arr[currentIndex] % 2 == 1) {
                tempIndex = currentIndex + L;
                if (tempIndex > (arr.length - 1)) {
                    currentIndex = L - Math.abs((arr.length - 1) - currentIndex) - 1;
                }
                else {
                    currentIndex += L;
                }

                arr[currentIndex] += 1;
                throwCount += 1;
            }
            else if (arr[currentIndex] % 2 == 0) {
                tempIndex = currentIndex -  L;
                if (tempIndex < 0) {
                    currentIndex = arr.length - Math.abs(currentIndex - L);
                }
                else {
                    currentIndex -= L;
                }
                arr[currentIndex] += 1;
                throwCount += 1;
            }

        }

        System.out.println(throwCount);
        sc.close();
    }
}
