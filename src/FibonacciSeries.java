
public class FibonacciSeries {
	public static void main(String[] args) {
		fib(10);
	}
	public static void fib(int n) {
		int n1=0;
		int n2=1;
		if (n==1)
			System.out.println(n1);
		else if (n==2) {
			System.out.println(n1);
			System.out.println(n2);
		}
		else {
			System.out.println(n1);
			System.out.println(n2);
			for (int i=2;i<=n-1;i++) {
				int n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.println(n3);
		}
		}
	}
}
