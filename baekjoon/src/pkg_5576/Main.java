package pkg_5576;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
    int[] W = new int[10];
    int[] maxW = new int[3];
    for (int i = 0; i < W.length; i++) {
      int value = sc.nextInt();
      W[i] = value;
    }


    for (int i = 0; i < 3; i++) {
      int max = 0;
      int idx = 0;
      for (int j = 0; j < W.length; j++) {
        if (W[j] >= max) {
          max = W[j];
          idx = j;
        } 
      }
      maxW[i] = max;
      W[idx] = -999;
    }

    int[] K = new int[10];
    int[] maxK = new int[3];
    for (int i = 0; i < W.length; i++) {
      int value = sc.nextInt();
      K[i] = value;
    }


    for (int i = 0; i < 3; i++) {
      int max = 0;
      int idx = 0;
      for (int j = 0; j < K.length; j++) {
        if (K[j] >= max) {
          max = K[j];
          idx = j;
        } 
      }
      maxK[i] = max;
      K[idx] = -999;
    }

    int sumW = 0;
    int sumK = 0;
    for (int i = 0; i < 3; i++) {
      sumW += maxW[i];
      sumK += maxK[i];
    }
    System.out.println(sumW + " " + sumK);

    sc.close();

  }

}
