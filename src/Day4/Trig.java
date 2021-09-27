//Write a program Trig.java to illustrate various trigonometric functions in the Math
//library, such as Math.sin(), Math.cos(), and Math.toRadians(). Firstly reads in an
//angle (in degrees), converts to radians, and then performs various trigonometric
//calculations.
package Day4;

import java.util.Scanner;

public class Trig {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter angle (in degrees) : ");
		double angleD=sc.nextDouble();
		double angleR=Math.toRadians(angleD);
		double sin=Math.sin(angleR);
		double cos=Math.cos(angleR);
		System.out.println("The sin value is : "+sin);
		System.out.println("The cos value is : "+cos);
	}
}
