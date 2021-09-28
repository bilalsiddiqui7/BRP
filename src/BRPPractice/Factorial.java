package BRPPractice;
public class Factorial {
	public static void main(String[] args) {
		factorial(7);
	}
	public static void factorial(int n) {
		int m=1;
		for(int i=1;i<=n;i++) {
			m=m*i;
		}
		System.out.println(m);
	}
}
