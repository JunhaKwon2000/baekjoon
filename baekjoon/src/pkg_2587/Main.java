package pkg_2587;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    int n4 = sc.nextInt();
    int n5 = sc.nextInt();

    int mean = (n1 + n2 + n3 + n4 + n5) / 5;
    // System.out.println(mean);

    int[] arr = {n1, n2, n3, n4, n5};
    int max = arr[0];
    int min = arr[0];
    int maxIdx = 0;
    int minIdx = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= max) {
        max = arr[i];
        maxIdx = i;
      }

      if (arr[i] <= min) {
        min = arr[i];
        minIdx = i;
      }
    }

    arr[maxIdx] = -1;
    arr[minIdx] = -1;

    max = 0;
    min = 101;
    maxIdx = 0;
    minIdx = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != -1) {
        if (arr[i] >= max) {
          max = arr[i];
          maxIdx = i;
        }
  
        if (arr[i] <= min) {
          min = arr[i];
          minIdx = i;
        }
      }
    }

    arr[maxIdx] = -1;
    arr[minIdx] = -1;

    int median = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != -1) {
        median = arr[i];
      }
    }

    System.out.println(mean);
    System.out.println(median);

    sc.close();

  }
}
