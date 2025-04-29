package pkg_2010;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < arr.length; i++) {
      int multi = sc.nextInt();
      arr[i] = multi;
    }

    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i == (arr.length - 1)) {
        max += arr[i];
      }
      else {
        max += arr[i] - 1;
      }
    }

    System.out.println(max);

    sc.close();
  }
}
