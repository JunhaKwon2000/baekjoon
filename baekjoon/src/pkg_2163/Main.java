package pkg_2163;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int M = sc.nextInt();
    int N = sc.nextInt();
    int row = 0;
    int col = 0;

    if (M <= N) {
      row = M - 1;
      col = M * (N - 1);
    }
    else {
      row = N - 1;
      col = N * (M - 1);
    }

    System.out.println(row + col);

    sc.close();
  }
}