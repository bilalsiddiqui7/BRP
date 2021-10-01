//To MathFunction.java add a static method sqrt() that takes a double argument and
//returns the square root of that number. Use Newton's method (see Sqrt.java) to
//compute the result. Also write overloaded version in which user specifies the error
//tolerance epsilon. Here are the functions
////return the square root of c, computed using Newton's method
//public static double sqrt(double c)
////overloaded version in which user specifies the error tolerance epsilon
//public static double sqrt(double c, double epsilon)
package Day9;

public class MathFunction2 {
	public static void sqrt(int c) {
		double t=c;
		double epsilon = 1e-15;
		while(Math.abs(t - c/t) > epsilon*t) {
			t=((c/t)+t)/2;
		}
		System.out.println("the square root of the given nonnegative number is "+t);
		
	}
	public static void main(String[] args) {
		sqrt(25);
	}
}
