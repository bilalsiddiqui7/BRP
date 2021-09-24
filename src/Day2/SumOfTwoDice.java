package Day2;

public class SumOfTwoDice {
	public static void main(String[] args) {
		int min=1;
		int max=6;
		int num1=(int)Math.floor(Math.random()*(max-min+1)+min);
		int num2=(int)Math.floor(Math.random()*(max-min+1)+min);
		int res=num1+num2;
		System.out.println("The sum of two random numbers between 1 to 6 is "+res);
	}
}
