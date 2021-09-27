//1. Write a program FlipCoin.java to simulate a coin flip and print out "Heads" or
//"Tails" accordingly and finally print the percentage of Head vs Tail.
package Day5;

public class FlipCoin {
	public static void main(String[] args) {
		int heads=0;
		int tails=0;
		for(int i=0;i<=100;i++) {
			int n=(int)Math.floor(Math.random()*2);
			if(n==0) {
				System.out.println("Heads");
				heads++;
			}
			else {
				System.out.println("Tails");
				tails++;
			}
		}
		System.out.println("the percentage of Head vs Tail is Head : "+heads+" Tail : "+tails);
		
	}
}
