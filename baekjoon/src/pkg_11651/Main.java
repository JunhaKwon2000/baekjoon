package pkg_11651;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Dimensions implements Comparable<Dimensions> {

    int X;
    int Y;

    Dimensions(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    @Override
    public int compareTo(Dimensions o) {
        if (Y == o.Y) {
            return X - o.X;
        }
        else {
            return Y - o.Y;
        }
    }

    @Override
	public int hashCode() {
		return Objects.hash(X, Y);
	}
}


public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        List<Dimensions> list = new ArrayList<>();

        for (int i = 0; i < N; i++){
            list.add(new Dimensions(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(list);
        for (Dimensions d : list) {
            System.out.println(d.X + " " + d.Y);
        }

        sc.close();

    }
}
