package PracticeProblems;

public class FactorialOfANum {
	public static int fac(int n) {
		int m=1;
		for(int i=1;i<=n;i++) {
			m=m*i;
		}
		return m;
	}
	public static void main(String[] args) {
		int res=fac(7);
		System.out.println(res);
	}
}
