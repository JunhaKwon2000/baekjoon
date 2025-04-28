package pkg_10988;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        String target = "";
        for (int i = word.length() - 1; i >= 0; i--) {
        	char chr = word.charAt(i);
        	target += chr;
        }
        
        if (word.equals(target)) {
        	System.out.println(1);
        }
        else {
        	System.out.println(0);
        }
        sc.close();
	}

}