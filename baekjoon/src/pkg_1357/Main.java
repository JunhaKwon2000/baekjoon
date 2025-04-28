package pkg_1357;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        String revX = "";
        String revY = "";
        
        for (int i = x.length() - 1; i >= 0; i--) {
        	char chr = x.charAt(i);
        	revX += chr;
        }
        
        for (int i = y.length() - 1; i >= 0; i--) {
        	char chr = y.charAt(i);
        	revY += chr;
        }
        
        int X = Integer.parseInt(revX);
        int Y = Integer.parseInt(revY);
        int plus = X + Y;

        String XY = Integer.toString(plus);
        String target = "";
        
        for (int i = XY.length() - 1; i >= 0; i--) {
        	char chr = XY.charAt(i);
        	target += chr;
        }
        
   
        System.out.println(Integer.parseInt(target));
        
        
	}

}
