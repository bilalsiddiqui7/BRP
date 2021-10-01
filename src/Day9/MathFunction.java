//Create MathFunction.java class and write following static methods that are done
//part of week 1
//a. To return an harmonic number
//b. To return a sin of an angle
//c. To return cosine of an angle
//d. To return Binary of a number
package Day9;

public class MathFunction {
	public static void harmonic(int n) {
		double Hn=1;
		for(double i=2;i<=n;i++) {
			Hn=Hn+1/i;
		}
		System.out.println("the nth harmonic number is "+Hn);
	}
	public static void binary(int n) {
		String bin="";
		while(n>0) {
			int rem=n%2;
			n=n/2;
			bin=rem+bin;
		}
		System.out.println(bin);
	}
	public static void sin(int n) {
		System.out.println(Math.sin(n));
	}
	public static void cos(int n) {
		System.out.println(Math.cos(n));
	}
	public static void main(String[] args) {
		harmonic(10);
		binary(10);
		sin(90);
		cos(90);
	}
}
