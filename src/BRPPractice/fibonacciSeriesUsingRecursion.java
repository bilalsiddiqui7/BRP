package BRPPractice;
class Fib {
	int n1=0;
	int n2=1;
	public int fibmet(int n) {
		int n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);
		if(n==1)
			return 1;
		else
			return fibmet(n-1);
	}

}
public class fibonacciSeriesUsingRecursion {
	public static void main(String[] args) {
		Fib obj=new Fib();
		obj.fibmet(10);
	}
}
