package pkg_1193;

class Q{
	public long func(long x) {
		long i = 1;
		while(true) {
			x = x - i;
			i++;
			if(x <= 0) {
				break;
			}
		}
		return i;
	}
}

public class Main {

	public static void main(String[] args) {
		
		Q q = new Q();
		System.out.println(q.func(5));

	}

}
