package pkg_canvas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        String line1 = sc.nextLine();
        String[] l1 = line1.split("");
        String line2 = sc.nextLine();
        String[] l2 = line2.split("");

        List<String> result = new ArrayList<>();
        if (((l1[0] + l1[1] + l2[1] + l2[0]).equals("HEPC")) || ((l1[0] + l2[0] + l2[1] + l1[1]).equals("HEPC"))) result.add("YES");
        
        
        sc.close();

    }
}
