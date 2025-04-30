package pkg_5919;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < arr.length; i++) {
      int value = sc.nextInt();
      arr[i] = value;
    }

    int cnt = 0;
    while (true) {
      int max = 0;
      int min = 10001;
      int minCount = 0;
      int idx = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] > max) {
          max = arr[j];
          idx = j;
        }
        if (arr[j] < min) {
          min = arr[j];
        }
      }

      for (int k = 0; k < arr.length; k++) {
        if (arr[k] == min) {
          arr[k] += 1;
          minCount += 1;
        }
      }
      arr[idx] -= minCount;

      
      if (arr.length == minCount) {
        break;
      }
      
      cnt+=minCount;
    }

    System.out.println(cnt);

    sc.close();

  }
}
