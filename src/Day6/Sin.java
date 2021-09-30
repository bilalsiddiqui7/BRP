
//Write two programs Sin.java and Cos.java that compute sin x and cos x using the
//Taylor series expansions as shown below...
//Note - Convert angle x to an angle between -2 PI and 2 PI using following logic
//x = x % (2 * Math.PI);
package Day6;

public class Sin {
	public static void main(String[] args) {
		double x=5;
		x = x%(2*Math.PI);
		double sinx=0;
		double fact=1;
		System.out.println(x);
		for(double i=1;i<=x;i+=2) {
			System.out.println(i);
			sinx=Math.pow(x,i);
			for(int j=1;j<=i;j++) {
				fact=fact*j;
			}
			System.out.println("fact"+fact);
		}
	}
}
