//2. Write a program PowerOf2.java that takes a command-line argument n and prints a
//table of the powers of 2 that are less than or equal to 2^n.
package Day5;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n=sc.nextInt();
		int power=0;
		for(int i=1;i<=n;i++) {
			power=(int)Math.pow(2,i);
			System.out.println("2 ^ "+i+" = "+power);
		}
	}
}
