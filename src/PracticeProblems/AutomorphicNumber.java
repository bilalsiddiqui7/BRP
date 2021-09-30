//In mathematics, an automorphic number is a number whose square "ends" in the same digits as the number itself. For example, 5^2 = 25, 6^2 = 36, 76^2 = 5776, and 890625^2 = 793212890625
//TO DO-WRONG LOGIC
package PracticeProblems;

public class AutomorphicNumber {
	public static void main(String[] args) {
		int n=6;
		int nog=n;
		int sq=nog*nog;
		int l=0;
		while(n>0) {
			n=n/10;
			l++;
		}
		int m=sq%(int)Math.pow(10,l);
		if(nog==m) {
			System.out.println("Number is Automorphic");
		} 
		else {
			System.out.println("Number is Not Automorphic");
		}
	}
}
