package BRPPractice;
public class factorialUsingRecursion {
	public static void main(String[] args) {
		int result=fact(7);
		System.out.println(result);
	}
	public static int fact(int n) {
		if(n==1)
			return 1;
		else
			return (n*fact(n-1));
	}
}
