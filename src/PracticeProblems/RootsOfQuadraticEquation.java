package PracticeProblems;

public class RootsOfQuadraticEquation {
	public static void main(String[] args) {
		int a=1;
		int b=5;
		int c=6;
		double d=b*b-4*a*c;
		double d1=Math.sqrt(d);
		double n1=(-b+d1)/2*a;
		double n2=(-b-d1)/2*a;
		System.out.println(n1+" "+n2);
 	}
}
