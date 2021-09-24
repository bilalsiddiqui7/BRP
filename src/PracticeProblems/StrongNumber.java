//Strong number is a special number whose sum of the factorial of digits is equal to the original number. For Example: 145 is strong number. Since, 1! + 4! + 5!=145.
package PracticeProblems;

public class StrongNumber {
	public static void main(String[] args) {
		int n=145;
		int nog=n;
		int num=0;
		while(n>0) {
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			num=num+fact;
			n=n/10;
		}
		if(num==nog)
			System.out.println("Number is a strong number");
		else
			System.out.println("Number is not a strong number");
	}
}
