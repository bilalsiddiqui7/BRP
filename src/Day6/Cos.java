//Write two programs Sin.java and Cos.java that compute sin x and cos x using the
//Taylor series expansions as shown below...
//Note - Convert angle x to an angle between -2 PI and 2 PI using following logic
//x = x % (2 * Math.PI);
package Day6;

public class Cos {
	public static void main(String[] args) {
		double x=5;
		x = x%(2*Math.PI);
		System.out.println(x);
	}
}
