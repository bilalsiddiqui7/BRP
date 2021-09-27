
//Write a program HarmonicNumber.java that takes a command-line argument n and
//prints the nth harmonic number. Harmonic Number is of the form
package Day4;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any positive number : ");
		double n=sc.nextDouble();
		double Hn=1;
		for(double i=2;i<=n;i++) {
			Hn=Hn+1/i;
		}
		System.out.println("prints the nth harmonic number is "+Hn);
	}
}
