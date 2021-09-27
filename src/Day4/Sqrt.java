//Write a Program Sqrt.java to compute the square root of a nonnegative number c
//given in the input using Newton's method:
//- initialize t = c
//- replace t with the average of c/t and t
//- repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t
//where epsilon = 1e-15;
package Day4;

import java.util.Scanner;

public class Sqrt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any positive number : ");
		double c=sc.nextDouble();
		double t=c;
		double epsilon = 1e-15;
		while(Math.abs(t - c/t) > epsilon*t) {
			t=((c/t)+t)/2;
		}
		System.out.println("the square root of the given nonnegative number is "+t);
		
	}
}
